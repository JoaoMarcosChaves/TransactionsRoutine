package app.repositories

import app.models.TransactionModel
import org.springframework.data.repository.PagingAndSortingRepository

interface TransactionsRepository extends PagingAndSortingRepository<TransactionModel, Long> {}