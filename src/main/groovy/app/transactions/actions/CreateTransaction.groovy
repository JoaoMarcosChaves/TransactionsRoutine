package app.transactions.actions

import app.databaseOperations.IDatabaseOperations
import app.models.TransactionModel
import app.transactions.interfaces.ICreateTransaction
import org.springframework.stereotype.Component
@Component
class CreateTransaction implements ICreateTransaction {

    private IDatabaseOperations databaseOperations

    CreateTransaction(IDatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations
    }

    @Override
    def createTransaction(Object dataToCreateTransaction) {
        def returnMap = [
                "success" : true,
                "error" : null,
                "msg" : "Transação criada com sucesso"
        ]
        try {

            TransactionModel newTransaction = new TransactionModel()

            newTransaction.setAccount_id(dataToCreateTransaction.account_id)
            newTransaction.setOperation_type_id(dataToCreateTransaction.operation_type_id)
            newTransaction.setAmount(dataToCreateTransaction.amount)
            newTransaction.setEvent_date(new Date())

            def returnDatabaseOperation = this.databaseOperations.save(newTransaction)

            if(!returnDatabaseOperation.success) {
                returnMap.success = false
                returnMap.error = "102"
                returnMap.msg = 'Não foi possível realizar a operação de criar transação. Tente novamente'
            }

            returnMap.transaction_id = returnDatabaseOperation.result.getTransaction_id()


            return returnMap
        } catch (Exception error) {
            returnMap.success = false
            returnMap.error = "101"
            returnMap = error.getMessage()

            return returnMap
        }
    }
}
