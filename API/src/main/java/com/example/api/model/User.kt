package com.example.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    val bio: String,
    val email: String,
    val image: Any,
    val token: String,
    val username: String
)