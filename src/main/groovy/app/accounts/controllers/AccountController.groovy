package app.accounts.controllers

import app.accounts.adapters.AccountActionsAdapter
import app.accounts.interfaces.IAccountController

class AccountController implements IAccountController {

    AccountController() {
        // Dependencias que podem ser injetadas
    }

    @Override
    def createAccount(Object request) {
        def responseMap = [
                "success" : true,
                "error" : null,
                "msg" : null
        ]
        try {
            AccountActionsAdapter accountActions = new AccountActionsAdapter()

            def dataToCreateAccount = request
            responseMap = accountActions.createAccount(dataToCreateAccount)

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = ""
            responseMap = error.getMessage()
            return responseMap
        }
    }

    @Override
    def getAccountById(Object request) {
        def responseMap = [
                "success" : true,
                "error" : null,
                "msg" : null
        ]
        try {
            AccountActionsAdapter accountActions = new AccountActionsAdapter()

            def dataToGetAccount = request
            responseMap = accountActions.getAccountById(dataToGetAccount)

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = ""
            responseMap = error.getMessage()
            return responseMap
        }

    }
}
