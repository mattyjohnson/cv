package com.nomaditas.cv.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomaditas.cv.model.Profile
import com.nomaditas.cv.model.Repository

class ProfileViewModel(repository: Repository) : ViewModel() {
    private var profile = repository.getProfile()

    fun getProfile(): MutableLiveData<Profile> {
        return profile
    }
}