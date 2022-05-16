package app

import data.Boss

fun main() {
    val boss1 = Boss("Teguh")

    val employee1 = boss1.Employee("Budi")
    val employee2 = boss1.Employee("Ningning")

    val boss2 = Boss("Ryujin")
    val employee3 = boss2.Employee("Lia")
    val employee4 = boss2.Employee("Yeji")

    println(employee1.hi())
    println(employee2.hi())
    println(employee3.hi())
    println(employee4.hi())
}