package com.prasoon.cards.domain

import com.prasoon.cards.domain.models.CardsDataModel
import com.prasoon.cards.repo.CardsRepository

class CardsUsecase(private val cardsRepository: CardsRepository) {

    suspend operator fun invoke(): List<CardsDataModel> {
        return cardsRepository.fetchCards()
    }
}