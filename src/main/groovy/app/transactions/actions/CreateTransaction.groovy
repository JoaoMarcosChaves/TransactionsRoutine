package app.transactions.actions

import app.transactions.interfaces.ICreateTransaction

class CreateTransaction implements ICreateTransaction {
    @Override
    def createTransaction(Object dataToCreateTransaction) {
        def returnMap = [
                "success" : true,
                "error" : null,
                "msg" : null
        ]
        try {
            println dataToCreateTransaction
            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = ""
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
