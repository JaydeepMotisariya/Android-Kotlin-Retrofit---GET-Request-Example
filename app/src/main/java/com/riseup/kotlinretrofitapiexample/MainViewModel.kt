package com.riseup.kotlinretrofitapiexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.riseup.kotlinretrofitapiexample.model.Post
import com.riseup.kotlinretrofitapiexample.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {
    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */
    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response= repository.getPost()
            myResponse.value = response
        }
    }
}