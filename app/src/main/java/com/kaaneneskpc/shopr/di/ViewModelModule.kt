package com.kaaneneskpc.shopr.di

import com.kaaneneskpc.shopr.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}