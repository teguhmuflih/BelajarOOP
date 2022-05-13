package data

open class Employee(val name:String) {
     open fun sayHello(name: String){
        println("Hello $name, my names is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my names is Manager ${this.name}")
    }
}

class SuperManager(name: String): Manager(name){
    //Error
//    final override fun sayHello(name: String) {
//        println("Hello $name, my names is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my names is Vice president ${this.name}")
    }
}