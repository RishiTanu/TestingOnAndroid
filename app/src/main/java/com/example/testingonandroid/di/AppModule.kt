package com.example.testingonandroid.di

import android.content.Context
import androidx.room.Room
import com.example.testingonandroid.other.Constants.BASE_URL
import com.example.testingonandroid.other.Constants.DATABASE_NAME
import com.example.testingonandroid.data.local.ShoppingItemDatabase
import com.example.testingonandroid.data.remote.PixabayApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideShoppingDatabase(
        @ApplicationContext context: Context,
    ) = Room.databaseBuilder(context, ShoppingItemDatabase::class.java, DATABASE_NAME).build()


    @Provides
    @Singleton
    fun providesDao(
        shoppingItemDatabase: ShoppingItemDatabase,
    ) = shoppingItemDatabase.shoppingDao()


    @Singleton
    @Provides
    fun providePixelBayApi(): PixabayApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PixabayApi::class.java)
    }
}