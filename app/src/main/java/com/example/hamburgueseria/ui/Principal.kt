package com.example.hamburgueseria.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.hamburgueseria.data.ListaProductos
import com.example.hamburgueseria.data.Producto
import com.example.hamburgueseria.data.UiState
import javax.sql.DataSource

@Composable
fun Principal (
    modifier: Modifier = Modifier,
    ventanaTotal: () -> Unit,
    ventanaIngredientes: () -> Unit,
    viewModel: ViewModel,
    uiState: UiState,
    productos: ArrayList<Producto> = ListaProductos.productos
) {
    listaProductos(productos = productos,viewModel,ventanaIngredientes)
}
@Composable
fun listaProductos(
    productos:ArrayList<Producto>,
    viewModel: ViewModel,
    ventanaIngredientes: () -> Unit
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
    ) {
        items(productos) { producto ->
            Card {
                Text(text = producto.nombre)
                Text(text = "${producto.precio}€")
                Column {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "añadir producto")
                    }
                    Button(onClick = ventanaIngredientes) {
                        Text(text = "ver ingredientes")
                    }
                }
            }
        }
    }
}
