package com.example.ucp2.ui.viewmodel

import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.ucp2.KrsApp
import com.example.ucp2.repository.LocalRepositoryDsn

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            DosenViewModel(
                KrsApp().containerApp.RepositoryDosen as LocalRepositoryDsn
            )
        }
        initializer {
            HomeDosenViewModel(
                KrsApp().containerApp.RepositoryDosen
            )
        }
        initializer {
            DetailDosenViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.RepositoryDosen
            )
        }
    }
}