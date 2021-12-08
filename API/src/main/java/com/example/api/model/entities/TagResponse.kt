package com.example.api.model.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagResponse(
    val tags: List<String>
)