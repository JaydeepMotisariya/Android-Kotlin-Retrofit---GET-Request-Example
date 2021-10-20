package com.riseup.kotlinretrofitapiexample.repository

import com.riseup.kotlinretrofitapiexample.api.RetrofitInstance
import com.riseup.kotlinretrofitapiexample.model.Post

class Repository {

    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */

    suspend fun getPost(): Post{
        return RetrofitInstance.api.getPost()
    }
}