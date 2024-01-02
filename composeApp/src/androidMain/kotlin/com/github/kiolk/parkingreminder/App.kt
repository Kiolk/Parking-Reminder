package com.github.kiolk.parkingreminder

import android.app.Application
import com.github.kiolk.parkingreminder.di.androidModule
import com.github.kiolk.parkingreminder.di.serviceModule
import coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        GlobalContext.startKoin {
            androidContext(applicationContext)
            modules(serviceModule(), coreModule, androidModule())
        }
    }
}