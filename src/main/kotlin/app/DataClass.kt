package app

import data.Product

fun main() {
    val product = Product("Kopiko",12000,"candy")

    val product2 = product.copy(name="Indomie")
    println(product)
    println(product2)
}