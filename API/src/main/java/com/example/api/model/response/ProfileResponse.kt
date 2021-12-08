package com.example.api.model.response

import com.example.api.model.requests.Profile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileResponse(
    val profile: Profile
)