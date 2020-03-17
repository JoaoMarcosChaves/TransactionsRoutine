package app.models

class TransactionModel {
    private int transaction_id
    private int account_id
    private int operation_type_id
    private Double amount
    private Date event_date

    int getTransaction_id() {
        return transaction_id
    }

    void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id
    }

    int getAccount_id() {
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
}
