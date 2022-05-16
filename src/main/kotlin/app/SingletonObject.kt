package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("teguh"))
    a()
    b()

    println(Application.Utilities.toUpper("teguh"))

    //Companion Object
    println(Application.Companion.hello("Eko"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}