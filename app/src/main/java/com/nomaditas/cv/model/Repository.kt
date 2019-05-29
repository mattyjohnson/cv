package com.nomaditas.cv.model

import androidx.lifecycle.MutableLiveData
import com.nomaditas.cv.network.Experience

interface Repository {
    fun getProfile(): MutableLiveData<Profile>
    fun getSkills(): MutableLiveData<List<String>>
    fun getExperience(): MutableLiveData<List<Experience>>
}