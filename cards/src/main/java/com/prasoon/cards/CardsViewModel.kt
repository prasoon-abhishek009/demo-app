package com.prasoon.cards

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prasoon.cards.domain.CardsUsecase
import com.prasoon.cards.domain.models.CardsDataModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CardsViewModel(private val cardsUsecase: CardsUsecase) : ViewModel() {
    private val _cards = MutableStateFlow<List<CardsDataModel>>(emptyList())
    val cards: StateFlow<List<CardsDataModel>> = _cards

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _cards.value = cardsUsecase()
            Log.d("insideViewmodel", _cards.value.toString())
        }
    }
}