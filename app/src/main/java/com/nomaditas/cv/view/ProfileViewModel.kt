package com.nomaditas.cv.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomaditas.cv.data.Profile
import com.nomaditas.cv.data.Repository

class ProfileViewModel : ViewModel() {
    private var profile = Repository.profile

    fun getProfile(): MutableLiveData<Profile> {
        return profile
    }
}