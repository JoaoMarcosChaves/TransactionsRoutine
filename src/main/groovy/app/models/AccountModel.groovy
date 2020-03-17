package app.models

class AccountModel {
    private int account_id
    private String document_number

    int getAccount_id() {
        return account_id
    }

    void setAccount_id(int account_id) {
        this.account_id = account_id
    }

    String getDocument_number() {
        return document_number
    }

    void setDocument_number(String document_number) {
        this.document_number = document_number
    }
}
