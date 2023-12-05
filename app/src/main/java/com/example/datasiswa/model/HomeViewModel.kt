package com.example.datasiswa.model

import androidx.lifecycle.ViewModel
import com.example.datasiswa.Repositori.RepositoriSiswa
import com.example.datasiswa.data.Siswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa):ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa:List<Siswa> = listOf()
    )

}