package com.example.hamburgueseria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hamburgueseria.ui.theme.HamburgueseriaTheme
import androidx.navigation.compose.rememberNavController
import com.example.hamburgueseria.data.Ingrediente
import com.example.hamburgueseria.data.Producto
import com.example.hamburgueseria.ui.Principal
import com.example.hamburgueseria.ui.Total
import com.example.hamburgueseria.ui.VerIngredientes
import com.example.hamburgueseria.ui.ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HamburgueseriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Principal()
                }
            }
        }
    }
}

@Composable
fun Principal(navController: NavHostController = rememberNavController()) {
    val viewModel: ViewModel = ViewModel()
    val uiState by viewModel.uiState
    NavHost(
        navController = navController,
        startDestination = "Principal",
    ) {
        composable(route = "Total") {
            Total()
        }
        composable(route = "VerIngredientes") {
            VerIngredientes(
                producto = Producto("hamburguesa", 7, arrayListOf(Ingrediente("carne"), Ingrediente("pan"), Ingrediente("lechuga"), Ingrediente("tomate"))),
                onClickCambiarPantalla = { navController.navigate("Principal") })
        }
        composable(route = "Principal") {
            Principal(
                viewModel = viewModel,
                uiState = uiState,
                ventanaTotal = { navController.navigate("Total") },
                ventanaIngredientes = { navController.navigate("VerIngredientes") })
        }

    }

}



