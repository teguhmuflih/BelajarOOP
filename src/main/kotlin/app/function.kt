package app

import data.Person

fun main() {
    val eko =Person()
    eko.firstName = "Eko"
    eko.middleName = "Kurniawan"
    eko.lastName = "Khannedy"

    eko.sayHello("budi")
    eko.run()
    val fullname = eko.getFullName()
    println(fullname)
}