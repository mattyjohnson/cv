package com.nomaditas.cv.di

import com.nomaditas.cv.model.Repository
import com.nomaditas.cv.model.RepositoryImpl
import com.nomaditas.cv.viewmodel.ExperienceViewModel
import com.nomaditas.cv.viewmodel.ProfileViewModel
import com.nomaditas.cv.viewmodel.SkillsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<Repository> { RepositoryImpl() }
    viewModel { ProfileViewModel(get()) }
    viewModel { SkillsViewModel(get()) }
    viewModel { ExperienceViewModel(get()) }
}