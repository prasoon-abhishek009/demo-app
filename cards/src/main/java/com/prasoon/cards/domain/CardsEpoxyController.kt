package com.prasoon.cards.domain

import android.util.Log
import com.airbnb.epoxy.TypedEpoxyController
import com.prasoon.cards.domain.models.CardsDataItemModel_
import com.prasoon.cards.domain.models.CardsDataModel

class CardsEpoxyController : TypedEpoxyController<List<CardsDataModel>>() {

    override fun buildModels(data: List<CardsDataModel>) {
        data.forEach { model ->
            Log.d("model", model.toString())
            CardsDataItemModel_()
                .id(model.hashCode())
                .cardName(model.name)
                .cardNumber(model.cardNumber)
                .validThru(model.validThru)
                .addTo(this)
        }
    }
}