package com.prasoon.accounts.domain

import com.airbnb.epoxy.TypedEpoxyController
import com.prasoon.accounts.domain.models.BaseAccountModel
import com.prasoon.accounts.domain.models.CreditAccountItemModel_
import com.prasoon.accounts.domain.models.CreditAccountsModel
import com.prasoon.accounts.domain.models.SavingsAccountItemModel_
import com.prasoon.accounts.domain.models.SavingsAccountsModel


class EpoxySampleController :
    TypedEpoxyController<List<BaseAccountModel>>() {

    override fun buildModels(data: List<BaseAccountModel>) {
        data.forEach { model ->
            when (model) {
                is SavingsAccountsModel -> {
                    addSavingsAccount(model)
                }

                is CreditAccountsModel -> {
                    addCreditAccount(model)
                }
            }
        }
    }

    private fun addCreditAccount(model: CreditAccountsModel) {
        CreditAccountItemModel_()
            .id(model.hashCode())
            .cardNumber(model.cardNumber)
            .addTo(this)
    }

    private fun addSavingsAccount(model: SavingsAccountsModel) {
        SavingsAccountItemModel_()
            .id(model.hashCode())
            .title(model.accountNumber)
            .balance("MUR ${model.balance}")
            .addTo(this)

    }
}