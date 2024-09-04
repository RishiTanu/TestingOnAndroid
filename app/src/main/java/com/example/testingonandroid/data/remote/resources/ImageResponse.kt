package com.example.testingonandroid.data.remote.resources


data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)