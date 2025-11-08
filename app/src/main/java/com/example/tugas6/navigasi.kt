package com.example.tugas6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas6.view.FormDaftar
import com.example.tugas6.view.HalamanDepan
import com.example.tugas6.view.ListPeserta

enum class Navigasi {
    cover,
    daftar,
    formu
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {

}