package com.example.datasiswa

import android.app.Application
import com.example.datasiswa.Repositori.ContainerApp
import com.example.datasiswa.Repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /*
    * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
    * */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}