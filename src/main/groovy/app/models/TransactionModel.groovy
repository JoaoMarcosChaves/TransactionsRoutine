package app.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'transactions')
class TransactionModel {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long transaction_id

    private Long account_id
    private int operation_type_id
    private Double amount
    private Date event_date


    Long getTransaction_id() {
        return transaction_id
    }

    void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id
    }

    Long getAccount_id() {
        return account_id
    }

    void setAccount_id(int account_id) {
        this.account_id = account_id
    }

    int getOperation_type_id() {
        return operation_type_id
    }

    void setOperation_type_id(int operation_type_id) {
        this.operation_type_id = operation_type_id
    }

    Double getAmount() {
        return amount
    }

    void setAmount(Double amount) {
        this.amount = amount
    }

    Date getEvent_date() {
        return event_date
    }

    void setEvent_date(Date event_date) {
        this.event_date = event_date
    }

    String getRepository() {
        return 'transactionsRepository'
    }
}
