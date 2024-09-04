package com.example.testingonandroid.repository

import androidx.lifecycle.LiveData
import com.example.testingonandroid.data.local.ShoppingItem
import com.example.testingonandroid.data.remote.resources.ImageResponse
import com.example.testingonandroid.other.Resource
import retrofit2.Response

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>


    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}