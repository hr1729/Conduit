package com.example.api.model.response

import com.example.api.model.requests.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResponse(
        @Json(name = "user")
    val user: User
)