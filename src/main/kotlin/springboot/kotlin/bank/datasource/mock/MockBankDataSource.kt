package springboot.kotlin.bank.datasource.mock

import org.springframework.stereotype.Repository
import springboot.kotlin.bank.datasource.BankDataSource
import springboot.kotlin.bank.model.Bank

@Repository
class MockBankDataSource: BankDataSource {
    val banks = listOf(
        Bank("0001", 3.0, 1),
        Bank("0002", 4.0, 10),
        Bank("0003", 5.0, 2)
    )

    override fun retrieveBanks(): Collection<Bank> =  banks
}