package com.nomaditas.cv.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/mattyjohnson/4c4e2ea1ef4c748b671bfb691ac59298/raw/32ae3ac7af82ac129b216c8a1cf84d87d80d1268/mattcv.json")
    fun getCv(): Call<ApiResponse>
}