package com.example.retrofitlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val myViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).cryptoCurrencyRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel.loadData()
    }
}