package com.example.api.model.entities

import com.example.api.model.entities.Comment
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleCommentResponse(
    val comments: Comment
)