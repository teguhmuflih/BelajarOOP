package data

import java.util.*

class Application(val name:String) {

    object Utilities{
        fun toUpper(value:String):String{
            return value.uppercase(Locale.getDefault())
        }
    }

    companion object {
        fun hello(name:String) {
            println("Hello $name")
        }
    }
}