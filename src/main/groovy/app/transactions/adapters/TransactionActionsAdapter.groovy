package app.transactions.adapters

import app.transactions.actions.CreateTransaction
import app.transactions.interfaces.ICreateTransaction

class TransactionActionsAdapter {

    private ICreateTransaction createTransaction

    TransactionActionsAdapter() {
        this.createTransaction = new CreateTransaction()
    }

    def createTransaction(Object dataToCreateTransaction) {
        return this.createTransaction.createTransaction(dataToCreateTransaction)
    }
}
