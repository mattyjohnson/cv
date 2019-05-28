package com.nomaditas.cv.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomaditas.cv.model.Repository

class SkillsViewModel : ViewModel() {
    private var skills = Repository.skills

    fun getSkills(): MutableLiveData<List<String>> {
        return skills
    }
}