package app.accounts.actions

import app.accounts.interfaces.ICreateAccount
import app.databaseOperations.IDatabaseOperations
import app.models.AccountModel
import org.springframework.stereotype.Component

@Component
class CreateAccount implements ICreateAccount{

    private IDatabaseOperations databaseOperations

    CreateAccount(IDatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations
    }

    @Override
    def createAccount(Object dataToCreateAccount) {
        def returnMap = [
            "success" : true,
            "error" : null,
            "msg" : "Conta criada com sucesso"
        ]
        try {

            AccountModel newAccount = new AccountModel()

            newAccount.setDocument_number(dataToCreateAccount.document_number)

            def returnDatabaseOperation = this.databaseOperations.save(newAccount)

            if(!returnDatabaseOperation.success) {
                returnMap.success = false
                returnMap.error = "004"
                returnMap.msg = 'Não foi possível realizar a operação de cadastro de conta. Tente novamente'
            }

            returnMap.account_id = returnDatabaseOperation.result.getAccount_id()

            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = "003"
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
