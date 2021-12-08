package com.example.retrofitlearning

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.retrofitlearning.entities.restApi.CryptoCurrencyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val cryptoRepository: CryptoCurrencyRepository
) : ViewModel() {


    fun loadData() = viewModelScope.launch(Dispatchers.IO) {
            Log.e("MainViewModel", "Перед началом запроса ")
            delay(5000)
            Log.e("LOG", cryptoRepository.getCryptoCurrencyList().toString())
        }

}

class MainViewModelFactory(
    private val cryptoRepository: CryptoCurrencyRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java))
            return MainViewModel(cryptoRepository) as T
        throw IllegalArgumentException("ViewModel not found")
    }

}