package springboot.kotlin.bank.service

import org.springframework.stereotype.Service
import springboot.kotlin.bank.datasource.BankDataSource
import springboot.kotlin.bank.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)
}