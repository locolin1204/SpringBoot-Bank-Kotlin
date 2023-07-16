package springboot.kotlin.bank.datasource.mock

import org.springframework.stereotype.Repository
import springboot.kotlin.bank.datasource.BankDataSource
import springboot.kotlin.bank.model.Bank

@Repository
class MockBankDataSource: BankDataSource {
    val banks = listOf(Bank("", 0.0, 1))

    override fun getBanks(): Collection<Bank> =  banks
}