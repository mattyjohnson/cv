package com.nomaditas.cv.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomaditas.cv.model.Repository
import com.nomaditas.cv.network.Experience

class ExperienceViewModel : ViewModel() {
    private var experience = Repository.experience

    fun getExperience(): MutableLiveData<List<Experience>> {
        return experience
    }
}