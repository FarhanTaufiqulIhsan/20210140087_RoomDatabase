package com.example.datasiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.datasiswa.ui.theme.Halaman.DestinasiEntry
import com.example.datasiswa.ui.theme.Halaman.DestinasiHome
import com.example.datasiswa.ui.theme.Halaman.EntrySiswaScreen
import com.example.datasiswa.ui.theme.Halaman.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()){

}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
                )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}