package springboot.kotlin.bank.datasource

import springboot.kotlin.bank.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}