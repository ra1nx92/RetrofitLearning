package com.example.retrofitlearning.entities

import com.google.gson.annotations.SerializedName

data class CryptoCurrencyResponse(
    @SerializedName("data") val data:List<CryptoResponse>,
    @SerializedName("status") val status:Status
)
