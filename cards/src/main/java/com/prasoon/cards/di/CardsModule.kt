package com.prasoon.cards.di

import com.prasoon.cards.CardsFragment
import com.prasoon.cards.CardsViewModel
import com.prasoon.cards.domain.CardsUsecase
import com.prasoon.cards.repo.CardsRepository
import com.prasoon.cards.repo.CardsRepositoryImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.TypeQualifier
import org.koin.core.qualifier.named
import org.koin.dsl.module


val cardsModule = module {
//    single<CardsRepository> { CardsRepositoryImpl() }
//    single { CardsUsecase(get()) }
//    viewModel { CardsViewModel(get()) }

//    scope(TypeQualifier(CardsScope::class)) {
//        scoped<CardsRepository> { CardsRepositoryImpl() }
//        scoped { CardsUsecase(get()) }
//        scoped { CardsViewModel(get()) }
//    }

    scope<CardsScope> {
        scoped<CardsRepository> { CardsRepositoryImpl() }
        scoped { CardsUsecase(get()) }
        scoped { CardsViewModel(get()) }
    }
}