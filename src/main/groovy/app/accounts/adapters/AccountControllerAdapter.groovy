package app.accounts.adapters

import app.accounts.controllers.AccountController
import app.accounts.interfaces.IAccountController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AccountControllerAdapter {

    @Autowired
    private AccountController accountControllerWired

    private IAccountController accountController

    def createTransaction(Object request) {
        accountController = accountControllerWired
        return this.accountController.createAccount(request)
    }

    def getAccountById(Object request) {
        accountController = accountControllerWired
        return this.accountController.getAccountById(request)
    }
}
