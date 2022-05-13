package app

import data.User

fun main() {
    val user1 = User("Eko", "rahasia")
    val user2 = User("Joko", "rahasia123")

    user1.username = "Budi"
    user1.password = "Sangat Rahasia"

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}