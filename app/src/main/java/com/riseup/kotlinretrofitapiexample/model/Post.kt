package com.riseup.kotlinretrofitapiexample.model

import com.google.gson.annotations.SerializedName

data class Post(
    /**
    Created by Jaydeep Motisariya
    20th October 2021
     */

    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)