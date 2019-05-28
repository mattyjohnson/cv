package com.nomaditas.cv.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/mattyjohnson/4c4e2ea1ef4c748b671bfb691ac59298/raw/745831e7e7c3536bc4f15d2a8adf39e494079b9b/mattcv.json")
    fun getCv(): Call<ApiResponse>
}