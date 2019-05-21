package com.nomaditas.cv.view

import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    val email = "matt@nomaditas.com"
    val phoneNumber = "07123456789"
    val linkedIn = "matt.linkedin.com"
    val visa = "British citizen"
    val availability = "01/01/1900"

    fun getName(): String {
        return "John Smith"
    }

    fun getSummary(): String {
        return "The quick brown fox jumps over the lazy dog"
    }

    fun getPictureUrl(): String {
        return "https://avatars3.githubusercontent.com/u/5430752?s=460&v=4"
    }

    fun getDetails() : String {
        return ""
    }

    private fun loadProfile() {
    }
}