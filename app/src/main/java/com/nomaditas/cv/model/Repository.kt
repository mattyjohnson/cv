package com.nomaditas.cv.model

import androidx.lifecycle.MutableLiveData
import com.nomaditas.cv.network.ApiResponse
import com.nomaditas.cv.network.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Repository {
    var profile = MutableLiveData<Profile>()

    init {
        val service = ApiServiceFactory.create()
        val call = service.getCv()
        call.enqueue(object: Callback<ApiResponse> {
            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // TODO: error handling
            }

            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                profile.value = response.body()?.let { Profile(it) }
            }
        })
    }
}