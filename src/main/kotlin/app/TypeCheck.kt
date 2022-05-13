package app

import data.HandPhone
import data.Laptop

fun printObject(any:Any){
    if (any is Laptop){
        println("laptop with name ${any.name}")
    }
    else if (any is HandPhone){
        println("Handphone with name ${any.name}")
    }
    else{
        println(any)
    }
}

fun printObjectWithWhen(any:Any){
    when (any) {
        is Laptop -> println("laptop with name ${any.name}")
        is HandPhone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any:Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any:Any){
    val value = any as? String
    println(value)
}

fun main() {
    printString("Eko")
//    printString(2) //error ClassCastException

    printStringSafe("Bambang")
    printStringSafe(1)

    printObjectWithWhen("Eko")
    printObjectWithWhen(1)
    printObjectWithWhen(true)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))
}