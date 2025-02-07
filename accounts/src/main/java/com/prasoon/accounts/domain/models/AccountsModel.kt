package com.prasoon.accounts.domain.models

data class SavingsAccountsModel(
    override val accountType: AccountType = AccountType.SAVINGS,
    var accountNumber: String = "",
    var balance: Long = 0
) : BaseAccountModel

data class CreditAccountsModel(
    override val accountType: AccountType = AccountType.CREDIT_CARD,
    var cardNumber: String = "",
) : BaseAccountModel

