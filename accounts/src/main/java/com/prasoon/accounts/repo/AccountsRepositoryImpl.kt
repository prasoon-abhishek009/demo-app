package com.prasoon.accounts.repo

import com.prasoon.accounts.domain.models.BaseAccountModel
import com.prasoon.accounts.domain.models.CreditAccountsModel
import com.prasoon.accounts.domain.models.SavingsAccountsModel

class AccountsRepositoryImpl : AccountsRepository {

    override suspend fun fetchData(): List<BaseAccountModel> {
        val accounts = listOf(
            SavingsAccountsModel(accountNumber = "01245467667", balance = 12234),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
            CreditAccountsModel(cardNumber = "VISA - 234445******3463"),
        )
        return accounts
    }
}