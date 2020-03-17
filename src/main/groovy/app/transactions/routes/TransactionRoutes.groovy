package app.transactions.routes

import app.transactions.adapters.TransactionControllerAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('pismo-test/transactions')

class TransactionRoutes {

    @PostMapping('')
    def createTransaction(@RequestBody Object newTransacitionDataReceivedByRequest) {
        TransactionControllerAdapter controller = new TransactionControllerAdapter()

        def request = newTransacitionDataReceivedByRequest
        return controller.createTransaction(request)
    }
}
