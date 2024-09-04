package com.example.testingonandroid.data.remote

import com.example.testingonandroid.data.remote.resources.ImageResponse
import com.example.testingonandroid.other.Resource
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = "API"
    ): Response<ImageResponse>

}