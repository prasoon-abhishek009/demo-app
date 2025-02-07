package com.prasoon.accounts.di

import com.prasoon.accounts.AccountsViewModel
import com.prasoon.accounts.domain.AccountsUsecase
import com.prasoon.accounts.repo.AccountsRepository
import com.prasoon.accounts.repo.AccountsRepositoryImpl
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val accountsModule = module {
    single<AccountsRepository> { AccountsRepositoryImpl() }
    single { AccountsUsecase(get()) }
    viewModel { AccountsViewModel(get()) }
}
