package com.example.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleCommentResponse(
    val comments: Comment
)