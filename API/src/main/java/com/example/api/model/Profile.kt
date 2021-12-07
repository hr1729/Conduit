package com.example.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Profile(
    val bio: String?,
    val following: Boolean=false,
    val image: String,
    val username: String
)