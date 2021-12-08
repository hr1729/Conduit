package com.example.api.model.response

import com.example.api.model.entities.Comment
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentResponse(
    val comments: List<Comment>
)