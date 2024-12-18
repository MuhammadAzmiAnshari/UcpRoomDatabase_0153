package com.example.ucp2.dependenciesinjection

import android.content.Context
import com.example.ucp2.data.database.KrsDatabase
import com.example.ucp2.repository.LocalRepositoryDsn
import com.example.ucp2.repository.LocalRepositoryMk
import com.example.ucp2.repository.RepositoryDosen
import com.example.ucp2.repository.RepositoryMataKuliah

interface InterfaceContainerApp {
        val RepositoryDosen: RepositoryDosen
        val RepositoryMataKuliah: RepositoryMataKuliah

}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val RepositoryDosen: RepositoryDosen by lazy {
        LocalRepositoryDsn(KrsDatabase.getDatabase(context).dosenDao())
    }

    override val RepositoryMataKuliah: RepositoryMataKuliah by lazy {
        LocalRepositoryMk(KrsDatabase.getDatabase(context).mataKuliahDao())
    }
}

