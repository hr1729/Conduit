package com.example.api.model.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Errors(
    val body: List<String>
)