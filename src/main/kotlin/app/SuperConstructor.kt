package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Eko")
    println(premiumCustomer.name)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Eko", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}