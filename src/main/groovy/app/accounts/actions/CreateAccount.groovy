package app.accounts.actions

import app.accounts.interfaces.ICreateAccount
import app.databaseOperations.IDatabaseOperations

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
            "msg" : null
        ]
        try {
            println dataToCreateAccount
            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = ""
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
