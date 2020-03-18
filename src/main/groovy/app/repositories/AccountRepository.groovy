package app.repositories

import app.models.AccountModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Component

@Component("accountRepo")
interface AccountRepository extends PagingAndSortingRepository<AccountModel, Long> {}