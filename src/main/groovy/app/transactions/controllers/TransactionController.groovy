package app.transactions.controllers

import app.transactions.adapters.TransactionActionsAdapter
import app.transactions.interfaces.ITransactionController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TransactionController implements ITransactionController {

    @Autowired
    TransactionActionsAdapter transactionActions

    @Override
    def createTransaction(Object request) {
        def responseMap = [
            "success" : true,
            "error" : null,
            "msg" : null
        ]
        try {

            def dataToCreateTransaction = request

            responseMap = transactionActions.createTransaction(dataToCreateTransaction)

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = "100"
            responseMap = error.getMessage()
            return responseMap
        }

    }

}
