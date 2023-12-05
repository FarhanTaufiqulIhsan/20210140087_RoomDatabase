package com.example.datasiswa.model

import androidx.lifecycle.ViewModel
import com.example.datasiswa.Repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa):ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
}