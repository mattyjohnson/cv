package com.nomaditas.cv.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomaditas.cv.model.Repository

class SkillsViewModel(repository: Repository) : ViewModel() {
    private var skills = repository.getSkills()

    fun getSkills(): MutableLiveData<List<String>> {
        return skills
    }
}