package app.databaseOperations

interface IDatabaseOperations {

    def findById(model, String field, value)
    def save(model)
    def delete(model)

}