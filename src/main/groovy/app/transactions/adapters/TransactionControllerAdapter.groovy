package app.transactions.adapters

import app.transactions.controllers.TransactionController
import app.transactions.interfaces.ITransactionController

class TransactionControllerAdapter {

    private ITransactionController transactionController

    TransactionControllerAdapter() {
        this.transactionController = new TransactionController()
    }

    def createTransaction(Object request) {
        return this.transactionController.createTransaction(request)
    }

}
