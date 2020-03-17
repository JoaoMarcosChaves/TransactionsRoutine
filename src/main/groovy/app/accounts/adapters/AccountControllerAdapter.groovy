package app.accounts.adapters

import app.accounts.controllers.AccountController
import app.accounts.interfaces.IAccountController

class AccountControllerAdapter {

    private IAccountController accountController

    AccountControllerAdapter() {
        this.accountController = new AccountController()
    }

    def createTransaction(Object request) {
        return this.accountController.createAccount(request)
    }

    def getAccountById(Object request) {
        return this.accountController.getAccountById(request)
    }
}
