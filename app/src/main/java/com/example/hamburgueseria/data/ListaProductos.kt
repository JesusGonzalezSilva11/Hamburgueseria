package com.example.hamburgueseria.data

object ListaProductos {
    val productos = arrayListOf<Producto>(
        Producto("hamburguesa", 7, arrayListOf(Ingrediente("carne"), Ingrediente("pan"), Ingrediente("lechuga"), Ingrediente("tomate"))),
        Producto("pizza", 5, arrayListOf(Ingrediente("masa"), Ingrediente("salsa"), Ingrediente("queso"), Ingrediente("toppings"))),
        Producto("kebab", 4, arrayListOf(Ingrediente("carne"), Ingrediente("pan"), Ingrediente("salsa"), Ingrediente("verduras"))),
        Producto("cocacola", 2, arrayListOf(Ingrediente("agua"), Ingrediente("azúcar"), Ingrediente("saborizante"))),
        Producto("agua", 1, arrayListOf(Ingrediente("agua")))
    )
}
