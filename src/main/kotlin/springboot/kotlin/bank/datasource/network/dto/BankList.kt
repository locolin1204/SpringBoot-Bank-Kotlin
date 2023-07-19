package springboot.kotlin.bank.datasource.network.dto

import springboot.kotlin.bank.model.Bank

data class BankList(
    val results: Collection<Bank>
)
