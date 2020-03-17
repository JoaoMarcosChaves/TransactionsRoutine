package app.accounts.routes

import app.accounts.adapters.AccountControllerAdapter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('pismo-test/accounts')
class AccountRoutes {

    @PostMapping('')
    def createAccount(@RequestBody Object newAccountDataReceivedByRequest) {
        AccountControllerAdapter controller = new AccountControllerAdapter()

        def request = newAccountDataReceivedByRequest
        return controller.createTransaction(request)
    }

    @GetMapping('{accountId}')
    def getAccountById(@PathVariable long accountId) {
        def request = ["accountId" : accountId]

        AccountControllerAdapter controller = new AccountControllerAdapter()

        return controller.getAccountById(request)
    }

}
