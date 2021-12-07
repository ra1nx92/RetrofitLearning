package com.example.retrofitlearning.entities

import com.google.gson.annotations.SerializedName

data class CryptoResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("rank") val rank: Int,
    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("is_active") val isActive: Int,
    @SerializedName("first_historical_data") val firstHistoricalData: String,
    @SerializedName("last_historical_data") val lastHistoricalData: String,
    @SerializedName("platform") val platform: Platform?
)