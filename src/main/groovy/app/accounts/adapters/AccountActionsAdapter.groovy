package app.accounts.adapters

import app.accounts.actions.CreateAccount
import app.accounts.actions.GetAccounts
import app.accounts.interfaces.ICreateAccount
import app.accounts.interfaces.IGetAccounts
import app.databaseOperations.DatabaseOperations
import app.databaseOperations.IDatabaseOperations

class AccountActionsAdapter {

    private ICreateAccount createAccount
    private IGetAccounts getAccounts

    AccountActionsAdapter() {
        IDatabaseOperations databaseOperationsToCreateAccounts = new DatabaseOperations()
        IDatabaseOperations databaseOperationsToGetAccounts = new DatabaseOperations()

        this.createAccount = new CreateAccount(databaseOperationsToCreateAccounts)
        this.getAccounts = new GetAccounts(databaseOperationsToGetAccounts)
    }

    def createAccount(Object dataToCreateAccount) {
        return this.createAccount.createAccount(dataToCreateAccount)
    }

    def getAccountById(Object dataToGetAccount) {
        return this.getAccounts.getAccountById(dataToGetAccount)
    }

}
