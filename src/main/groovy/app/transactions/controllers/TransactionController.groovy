package app.transactions.controllers

import app.transactions.adapters.TransactionActionsAdapter
import app.transactions.interfaces.ITransactionController

class TransactionController implements ITransactionController {

    @Override
    def createTransaction(Object request) {
        def responseMap = [
            "success" : true,
            "error" : null,
            "msg" : null
        ]
        try {

            TransactionActionsAdapter transactionActions = new TransactionActionsAdapter()
            def dataToCreateTransaction = request

            responseMap = transactionActions.createTransaction(dataToCreateTransaction)

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = ""
            responseMap = error.getMessage()
            return responseMap
        }

    }

}
