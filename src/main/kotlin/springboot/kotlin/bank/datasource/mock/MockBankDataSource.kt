package springboot.kotlin.bank.datasource.mock

import org.springframework.stereotype.Repository
import springboot.kotlin.bank.datasource.BankDataSource
import springboot.kotlin.bank.model.Bank

@Repository
class MockBankDataSource : BankDataSource {
    val banks = mutableListOf(
        Bank("0001", 3.0, 1),
        Bank("0002", 4.0, 10),
        Bank("0003", 5.0, 2)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
    }

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exist")
        }
        banks.add(bank)
        return bank
    }

    override fun updateBank(bank: Bank): Bank {

        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Bank with account number ${bank.accountNumber} does not exist")

        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Bank with account number $accountNumber does not exist")
        banks.remove(currentBank)
    }
}