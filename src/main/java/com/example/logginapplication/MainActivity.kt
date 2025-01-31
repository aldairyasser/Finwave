package com.example.logginapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.logginapplication.login.ui.ChatScreen
import com.example.logginapplication.login.ui.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "Login" //Pantalla principal
            ){
                composable("Login"){ LoginScreen(navController) } //Declaramos el nombre de ruta de las pantallas
                composable("Chat"){ ChatScreen() }
            }
        }
    }
}
