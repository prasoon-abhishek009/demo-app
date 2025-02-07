package com.prasoon.accounts.domain.models

interface BaseAccountModel {
    val accountType: AccountType
}

enum class AccountType {
    SAVINGS,
    CREDIT_CARD,
}