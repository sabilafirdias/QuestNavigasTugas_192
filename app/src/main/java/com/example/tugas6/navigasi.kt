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
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.cover.name,
            modifier = Modifier.padding(isiRuang)
        ) {

            // --- Halaman Depan ---
            composable(route = Navigasi.cover.name) {
                HalamanDepan(
                    onNavigate = {
                        navController.navigate(Navigasi.daftar.name)
                    }
                )
            }

            // --- List Peserta ---
            composable(route = Navigasi.daftar.name) {
                ListPeserta(
                    onBeranda = {
                        navController.navigate(Navigasi.cover.name)
                    },
                    onForm = {
                        navController.navigate(Navigasi.formu.name)
                    }
                )
            }

            // --- Form Pendaftaran ---
            composable(route = Navigasi.formu.name) {
                FormDaftar(
                    onBeranda = {
                        navController.popBackStack(
                            route = Navigasi.daftar.name,
                            inclusive = false
                        )
                    }
                )
            }
        }
    }
}