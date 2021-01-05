package com.junho.voicecall.di

import com.junho.voicecall.ui.intro.IntroViewModel
import com.junho.voicecall.ui.main.MainViewModel
import org.koin.androidx.compose.get
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        IntroViewModel()
    }

    viewModel {
        MainViewModel()
    }
}