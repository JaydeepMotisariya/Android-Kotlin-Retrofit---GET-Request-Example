package com.riseup.kotlinretrofitapiexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.riseup.kotlinretrofitapiexample.repository.Repository

class MainViewModelFactory(
    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */
    private val repository: Repository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }


}