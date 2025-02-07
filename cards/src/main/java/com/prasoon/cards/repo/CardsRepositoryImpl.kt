package com.prasoon.cards.repo

import com.prasoon.cards.domain.models.CardsDataModel

class CardsRepositoryImpl : CardsRepository {

    override suspend fun fetchCards() : List<CardsDataModel>{
            return listOf(
                CardsDataModel("Prasoon", "**** **** 3269", "09/25"),
                CardsDataModel("Abhishek", "**** **** 6641", "06/29"),
                CardsDataModel("Pratik", "**** **** 8767", "09/30"),
                CardsDataModel("Anshuman", "**** **** 9975", "11/28"),
            )
    }
}