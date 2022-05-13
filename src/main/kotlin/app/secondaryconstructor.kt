package app

import data.Address

fun main() {
    val address1 = Address("Manglad","Sukabumi")
    val address2 = Address("Atmawigena","Kab Bandung","Indonesia")

    println(address1.street)
    println(address2.street)

}