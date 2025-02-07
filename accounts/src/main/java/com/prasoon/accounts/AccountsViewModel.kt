package com.prasoon.accounts

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prasoon.accounts.domain.AccountsUsecase
import com.prasoon.accounts.domain.models.BaseAccountModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AccountsViewModel(private val accountsUsecase: AccountsUsecase) : ViewModel() {

    private val _accounts = MutableStateFlow<List<BaseAccountModel>>(emptyList())
    val accounts: StateFlow<List<BaseAccountModel>> = _accounts

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
//            Log.d("insideViewmodel", data.toString())
            _accounts.value = accountsUsecase()
        }
    }

}