package com.prasoon.accounts.repo

import com.prasoon.accounts.domain.models.BaseAccountModel

interface AccountsRepository {
    suspend fun fetchData(): List<BaseAccountModel>
}