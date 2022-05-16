package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    println(base.sayHello("Teguh"))

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Hanif")
}