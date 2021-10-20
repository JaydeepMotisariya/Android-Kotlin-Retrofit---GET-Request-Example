package com.riseup.kotlinretrofitapiexample.api

import com.riseup.kotlinretrofitapiexample.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */
    private val retrofit by lazy {

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy {

        retrofit.create(SimpleApi::class.java)
    }
}