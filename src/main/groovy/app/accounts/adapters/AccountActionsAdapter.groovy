package app.accounts.adapters

import app.accounts.actions.CreateAccount
import app.accounts.actions.GetAccounts
import app.accounts.interfaces.ICreateAccount
import app.accounts.interfaces.IGetAccounts
import app.databaseOperations.DatabaseOperations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AccountActionsAdapter {

    @Autowired
    private DatabaseOperations databaseOperationsWired

    @Autowired
    private ICreateAccount createAccount = new CreateAccount(databaseOperationsWired)

    @Autowired
    private IGetAccounts getAccounts = new GetAccounts(databaseOperationsWired)


    def createAccount(Object dataToCreateAccount) {
        return this.createAccount.createAccount(dataToCreateAccount)
    }

    def getAccountById(Object dataToGetAccount) {
//        getAccounts = getAccountsWired
        return this.getAccounts.getAccountById(dataToGetAccount)
    }

}
