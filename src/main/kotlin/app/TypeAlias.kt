package app

import data.Application

typealias App = Application
typealias Aplikasi = App
typealias App2 = data2.Application

typealias StringSupplier = () -> String

fun sayhello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Joni")
    val aplikasi = Aplikasi("John")
    val app2 = App("Hamura")

    sayhello { "Teguh" }
}