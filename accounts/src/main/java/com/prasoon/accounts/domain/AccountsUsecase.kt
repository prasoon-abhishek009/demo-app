package com.prasoon.accounts.domain

import com.prasoon.accounts.domain.models.BaseAccountModel
import com.prasoon.accounts.repo.AccountsRepository

class AccountsUsecase(private val accountsRepository: AccountsRepository) {

    suspend operator fun invoke(): List<BaseAccountModel>{
        return accountsRepository.fetchData()
    }

}