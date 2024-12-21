package com.example.ucp2.ui.navigation

interface AlamatNavigasi {
    val route: String
}

object DestinasiHomeDosen : AlamatNavigasi {
    override val route = "home_dosen"
}

object DestinasiDetailDosen : AlamatNavigasi {
    override val route = "detail_dosen"
    const val KODE_DOSEN = "kode_dosen"
    val routesWithArg = "$route/{$KODE_DOSEN}"
}

object DestinasiHomeMataKuliah : AlamatNavigasi {
    override val route = "home_matakuliah"
}

object DestinasiDetailMataKuliah : AlamatNavigasi {
    override val route = "detail_matakuliah"
    const val KODE_MATAKULIAH = "kode_matakuliah"
    val routesWithArg = "$route/{$KODE_MATAKULIAH}"
}

object DestinasiUpdateMataKuliah : AlamatNavigasi {
    override val route = "update_matakuliah"
    const val KODE_MATAKULIAH = "kode_matakuliah"
    val routesWithArg = "$route/{$KODE_MATAKULIAH}"
}