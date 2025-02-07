package com.prasoon.demoapp.di

import com.prasoon.demoapp.HomeBtnImpl
import com.prasoon.home.HomeBtnInterface
import org.koin.dsl.module


val appModule = module {
    single<HomeBtnInterface> { HomeBtnImpl() }
}
