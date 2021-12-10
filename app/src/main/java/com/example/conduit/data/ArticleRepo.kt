package com.example.conduit.data

import com.example.api.Client

object ArticleRepo {
    val api=Client().api
    suspend fun getGlobalFeed() = api.getArticles()

}