package app.databaseOperations

interface IDatabaseOperations {

    def findBy(model, String field, value)
    def save(model)
    def delete(model)

}