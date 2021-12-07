package com.example.retrofitlearning.entities.restApi

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    //постоение ретрофита
    private const val BASE_URL = "https://pro-api.coinmarketcap.com/"
    const val API_KEY = "e997ee50-9ff7-4b88-81a2-fef66bee3dee"
    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
                .build()
        )
        .build()

    fun getCryptoService():CryptoCurrencyApi = getRetrofit().create(CryptoCurrencyApi::class.java)
}