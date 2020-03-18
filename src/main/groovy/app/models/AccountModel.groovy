package app.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'accounts')
class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id

    private String document_number


    Long getAccount_id() {
        return account_id
    }

    void setAccount_id(Long account_id) {
        this.account_id = account_id
    }

    String getDocument_number() {
        return document_number
    }

    void setDocument_number(String document_number) {
        this.document_number = document_number
    }

    String getRepository() {
        return 'accountRepository'
    }

}
