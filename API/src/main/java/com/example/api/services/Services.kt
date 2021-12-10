package com.example.api.services

import com.example.api.model.requests.UserCredential
import com.example.api.model.requests.signUpRequest
import com.example.api.model.response.ArticlesResponse
import com.example.api.model.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Services {
    @POST("users")
    suspend fun signupuser(
            @Body userdata: signUpRequest

    ):Response<UserResponse>
    @GET("articles")
   suspend fun getArticles(
            @Query("author") author: String? = null,
            @Query("favourited") favourited: String? = null,
            @Query("tag") tags: String? = null
    ): Response<ArticlesResponse>
}