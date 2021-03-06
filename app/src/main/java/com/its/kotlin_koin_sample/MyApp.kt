package com.its.kotlin_koin_sample

import android.app.Application
import androidx.lifecycle.ViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule , viewmodelModule))
        }
    }
}