package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Infinix Hot 9","Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}