package app.accounts.actions

import app.accounts.interfaces.IGetAccounts
import app.databaseOperations.IDatabaseOperations
import app.models.AccountModel

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
                "msg" : null
        ]
        try {

            println dataToGetAccount
            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = ""
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
