package com.nomaditas.cv.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServiceFactory {
    private const val baseUrl = "https://gist.githubusercontent.com/"

    fun create(): ApiService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()

        return retrofit.create(ApiService::class.java)
    }
}