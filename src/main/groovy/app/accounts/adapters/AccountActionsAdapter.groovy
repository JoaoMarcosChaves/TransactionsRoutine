package app.accounts.adapters

import app.accounts.actions.CreateAccount
import app.accounts.actions.GetAccounts
import app.accounts.interfaces.ICreateAccount
import app.accounts.interfaces.IGetAccounts

class AccountActionsAdapter {

    private ICreateAccount createAccount
    private IGetAccounts getAccounts

    AccountActionsAdapter() {
        this.createAccount = new CreateAccount()
        this.getAccounts = new GetAccounts()
    }

    def createAccount(Object dataToCreateAccount) {
        return this.createAccount.createAccount(dataToCreateAccount)
    }

    def getAccountById(Object dataToGetAccount) {
        return this.getAccounts.getAccountById(dataToGetAccount)
    }

}
