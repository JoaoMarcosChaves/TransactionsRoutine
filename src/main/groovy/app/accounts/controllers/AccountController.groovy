package app.accounts.controllers

import app.accounts.adapters.AccountActionsAdapter
import app.accounts.interfaces.IAccountController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AccountController implements IAccountController {

    @Autowired
    AccountActionsAdapter accountActions

    @Override
    def createAccount(Object request) {
        def responseMap = [
                "success" : true,
                "error" : null,
                "msg" : null
        ]
        try {

            def dataToCreateAccount = request
            responseMap = accountActions.createAccount(dataToCreateAccount)

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = "001"
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

            def dataToGetAccount = request
            responseMap = accountActions.getAccountById(dataToGetAccount)

            if(responseMap.success) {
                responseMap = responseMap.account
            }

            return responseMap
        } catch(Exception error) {
            responseMap.success = false
            responseMap.error = "002"
            responseMap = error.getMessage()
            return responseMap
        }

    }
}
