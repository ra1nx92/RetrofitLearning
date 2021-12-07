package com.example.retrofitlearning.entities.restApi

import com.example.retrofitlearning.entities.data.Crypto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CryptoCurrencyRepository(
    private val cryptoApi: CryptoCurrencyApi //создаем обьект интерфейса
) {
    //получаем из общего списка только необходимые поля
    suspend fun getCryptoCurrencyList(): List<Crypto> = withContext(Dispatchers.IO) {
        cryptoApi.getCryptoCurrencyList(ApiFactory.API_KEY).data.map {
            Crypto(id = it.id, name = it.name, rank = it.rank)
        }
    }
}