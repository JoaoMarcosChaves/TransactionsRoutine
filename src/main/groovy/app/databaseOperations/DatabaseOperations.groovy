package app.databaseOperations

import app.models.AccountModel
import app.repositories.AccountRepository
import app.repositories.TransactionsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Component

@Component
class DatabaseOperations implements IDatabaseOperations {

    @Autowired
    AccountRepository accountRepository

    @Autowired
    TransactionsRepository transactionsRepository

    @Override
    def findById(model, String field, value) {
        def repository = getRepositoryToDatabaseOperation(model.getRepository())
        if(!repository) return ["success" : false]

        def returnOfDatabaseOperation = repository.findById(value).orElse(null)

        return ["success" : true, "result" : returnOfDatabaseOperation]
    }

    @Override
    def save(model) {
        def repository = getRepositoryToDatabaseOperation(model.getRepository())
        if(!repository) return ["success" : false]
        def returnOfDatabaseOperation = repository.save(model)

        return ["success" : true, "result" : returnOfDatabaseOperation]
    }

    @Override
    def delete(model) {
        return null
    }

    AccountModel teste() {
        println repository
    }

    def getRepositoryToDatabaseOperation(String repositoryName) {
        if(repositoryName == 'accountRepository') return accountRepository
        if(repositoryName == 'transactionsRepository') return transactionsRepository

        return false
    }

}
