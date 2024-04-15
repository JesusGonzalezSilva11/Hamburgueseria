package com.example.hamburgueseria.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.hamburgueseria.data.Producto
@Composable
fun VerIngredientes (
    producto: Producto,
    onClickCambiarPantalla: () -> Unit
){
    Text(text = "${producto.nombre}, ingredientes:")
    LazyColumn() {
        items(producto.ingredientes){ ingrediente->
            Text(text = ingrediente.nombre)
        }
    }
    Button(onClick =  onClickCambiarPantalla ) {
        Text(text = "Volver")
    }
}