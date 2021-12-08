package com.example.api.model.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticlesResponse(
        val articles: List<Article>,
        val articlesCount: Int
)