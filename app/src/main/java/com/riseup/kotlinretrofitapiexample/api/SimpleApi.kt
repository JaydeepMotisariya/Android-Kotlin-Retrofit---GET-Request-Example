package com.riseup.kotlinretrofitapiexample.api

import com.riseup.kotlinretrofitapiexample.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */

    @GET("posts/1")
    suspend fun getPost():Post
}