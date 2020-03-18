package app.transactions.adapters

import app.transactions.controllers.TransactionController
import app.transactions.interfaces.ITransactionController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TransactionControllerAdapter {

    @Autowired
    TransactionController transactionControllerWired

    private ITransactionController transactionController

    def createTransaction(Object request) {
        transactionController = transactionControllerWired
        return this.transactionController.createTransaction(request)
    }

}
