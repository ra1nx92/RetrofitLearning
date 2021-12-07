package com.example.retrofitlearning

import android.app.Application
import com.example.retrofitlearning.entities.restApi.ApiFactory
import com.example.retrofitlearning.entities.restApi.CryptoCurrencyRepository

class App : Application() {

    val cryptoCurrencyRepository: CryptoCurrencyRepository by lazy {
        CryptoCurrencyRepository(ApiFactory.getCryptoService())
    }

    override fun onCreate() {
        super.onCreate()
    }
}