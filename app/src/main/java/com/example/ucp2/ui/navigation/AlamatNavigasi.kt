package com.example.ucp2.ui.navigation

interface AlamatNavigasi {
    val route: String
}

object HomeRoute : AlamatNavigasi{
    override val route = "home"
}

object DestinasiHomeDosen : AlamatNavigasi {
    override val route = "home_dosen"
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