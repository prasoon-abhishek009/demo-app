package com.prasoon.cards.repo

import com.prasoon.cards.domain.models.CardsDataModel

interface CardsRepository {
    suspend fun fetchCards():List<CardsDataModel>
}