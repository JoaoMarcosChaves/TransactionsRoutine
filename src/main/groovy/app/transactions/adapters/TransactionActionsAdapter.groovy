package app.transactions.adapters

import app.databaseOperations.DatabaseOperations
import app.transactions.actions.CreateTransaction
import app.transactions.interfaces.ICreateTransaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TransactionActionsAdapter {

    @Autowired
    private DatabaseOperations databaseOperationsWired

    @Autowired
    private ICreateTransaction createTransaction = new CreateTransaction(databaseOperationsWired)


    def createTransaction(Object dataToCreateTransaction) {
        return createTransaction.createTransaction(dataToCreateTransaction)
    }
}
