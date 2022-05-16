package app

import exception.ValidationException

fun validateAndSayHello(name:String){
    if(name.isBlank()){
        throw ValidationException("Name is Blank")
    }else{
        println("Hello $name")
    }
}

fun main() {
    try{
        validateAndSayHello("Teguh")
        validateAndSayHello("")
    }catch (error:ValidationException){
        println("Terjadi Error ${error.message}")
    }catch (error:java.lang.NullPointerException){
        println("Terjadi Error ${error.message}")
    }catch (error:Throwable){
        println("Terjadi Error ${error.message}")
    }finally {
        println("Program Selesai")
    }
}