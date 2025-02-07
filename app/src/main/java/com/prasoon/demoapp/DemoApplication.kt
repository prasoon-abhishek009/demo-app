package com.prasoon.demoapp

import android.app.Application
import com.prasoon.accounts.di.accountsModule
import com.prasoon.cards.di.cardsModule
import com.prasoon.demoapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DemoApplication)
            modules(listOf(appModule, accountsModule, cardsModule))
        }
    }
}