package app.accounts.actions

import app.accounts.interfaces.ICreateAccount

class CreateAccount implements ICreateAccount{

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
