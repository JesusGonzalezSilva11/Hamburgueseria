package com.example.hamburgueseria.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.hamburgueseria.data.ListaProductos
import com.example.hamburgueseria.data.Producto
import com.example.hamburgueseria.data.UiState

class ViewModel {
    private val _uiState = mutableStateOf(UiState())
    val uiState : MutableState<UiState> = _uiState
    private val productos = ListaProductos.productos
    fun añadirProducto(
        producto: Producto,
        uiState: UiState
    ){

    }
    fun productoActualizar(ventanaIngredientes: () -> Unit, actual:Producto){
        uiState.productoActual(actual)
    }
}