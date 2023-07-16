package springboot.kotlin.bank.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`(){
        val banks = mockDataSource.getBanks()
        assertThat(banks).isNotEmpty
    }
}