package com.example.api


import com.example.api.services.Services
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.lang.ref.Cleaner.create

class Client {
    val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://api.realworld.io/api/")
        .addConverterFactory(MoshiConverterFactory.create()).build()
    val api=retrofit.create(Services::class.java)


}