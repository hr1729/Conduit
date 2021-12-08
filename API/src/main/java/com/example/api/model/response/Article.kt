package com.example.api.model.response

import com.example.api.model.requests.Profile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Article(
        val author: Profile,
        val body: String,
        val createdAt: String,
        val description: String,
        val favorited: Boolean,
        val favoritesCount: Int,
        val slug: String,
        val tagList: List<String>,
        val title: String,
        val updatedAt: String
)