package app.accounts.actions

import app.accounts.interfaces.IGetAccounts
import app.databaseOperations.IDatabaseOperations
import app.models.AccountModel
import org.springframework.stereotype.Service

@Service
class GetAccounts implements IGetAccounts{

    private IDatabaseOperations databaseOperations

    GetAccounts(IDatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations
    }

    @Override
    def getAccountById(Object dataToGetAccount) {
        def returnMap = [
                "success" : true,
                "error" : null,
                "msg" : null,
                account: [:]
        ]
        try {
            AccountModel accountModel = new AccountModel()

            def returnDatabaseOperation = this.databaseOperations.findById(accountModel, 'account_id', dataToGetAccount.accountId)

            if(!returnDatabaseOperation.success) {
                returnMap.success = false
                returnMap.error = "006"
                returnMap.msg = 'Não foi possível realizar a operação de consulta de conta por ID. Tente novamente'
            }

            if(returnDatabaseOperation.result) {
                def accountResultMap = [
                    "account_id" : returnDatabaseOperation.result.getAccount_id(),
                    "document_number" : returnDatabaseOperation.result.getDocument_number(),
                ]

                returnMap.account = accountResultMap
            }

            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = "005"
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
