package com.nomaditas.cv.data

import com.nomaditas.cv.network.ApiResponse

class Profile (response: ApiResponse) {
    val name: String = response.name
    val email: String = response.email
    val phoneNumber: String = response.phoneNumber
    val linkedIn: String = response.linkedIn
    val visaStatus: String = response.visaStatus
    val availability: String = response.availability
    val profile: String = response.profile
    val photoUrl: String = response.photoUrl
}