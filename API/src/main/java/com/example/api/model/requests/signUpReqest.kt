package com.example.api.model.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class signUpRequest(
    @Json(name = "user")
    val user: UserCredential
)