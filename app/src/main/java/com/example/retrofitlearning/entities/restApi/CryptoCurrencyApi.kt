package com.example.retrofitlearning.entities.restApi

import com.example.retrofitlearning.entities.CryptoCurrencyResponse
import com.example.retrofitlearning.entities.restApi.ApiFactory.API_KEY
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface CryptoCurrencyApi {
    @GET("v1/cryptocurrency/map")
   suspend fun getCryptoCurrencyList(@Header("X-CMC_PRO_API_KEY") apiKey: String):CryptoCurrencyResponse
}