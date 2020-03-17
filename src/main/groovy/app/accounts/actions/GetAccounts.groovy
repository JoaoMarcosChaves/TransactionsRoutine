package app.accounts.actions

import app.accounts.interfaces.IGetAccounts

class GetAccounts implements IGetAccounts{
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
