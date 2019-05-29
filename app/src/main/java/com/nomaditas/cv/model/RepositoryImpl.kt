package com.nomaditas.cv.model

import androidx.lifecycle.MutableLiveData
import com.nomaditas.cv.network.ApiResponse
import com.nomaditas.cv.network.ApiServiceFactory
import com.nomaditas.cv.network.Experience
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl: Repository {
    private var profile = MutableLiveData<Profile>()
    private var skills = MutableLiveData<List<String>>()
    private var experience = MutableLiveData<List<Experience>>()

    override fun getProfile(): MutableLiveData<Profile> {
        return profile
    }

    override fun getSkills(): MutableLiveData<List<String>> {
        return skills
    }

    override fun getExperience(): MutableLiveData<List<Experience>> {
        return experience
    }

    init {
        val service = ApiServiceFactory.create()
        val call = service.getCv()
        call.enqueue(object: Callback<ApiResponse> {
            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // TODO: error handling
            }

            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                profile.value = response.body()?.let { Profile(it) }
                skills.value = response.body()?.skills
                experience.value = response.body()?.experience
            }
        })
    }
}