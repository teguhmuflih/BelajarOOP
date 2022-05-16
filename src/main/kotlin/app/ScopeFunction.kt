package app

import data.Student

fun main() {
    val student = Student("Eko", 15)
    student.let {
        println(it.name)
        println(it.age)
    }

    val result2 = student.run {
        "Name ${this.name} and Age ${this.age}"
    }
    println(result2)

    val result3 : Student = student.apply {
        "Name ${this.name} and Age ${this.age}"
    }
    println(result3) // balikannya tetap student

    val result4 : Student = student.also {
        "Name ${it.name} and Age ${it.age}"
    }
    println(result4)

    val result5= with(student) {
        "Name ${this.name} and Age ${this.age}"
    }
    println(result5)

}