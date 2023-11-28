package com.exampl.repasoKotlin.POOColaboracion

class PersonaParametros (var nombre:String, var edad:Int){
    fun imprimir(){
        println("Nombre: ${nombre} y edad: ${edad}")
    }

    fun mayorEdad(){
        if (edad >= 18){
            println("${nombre} eres mayor de edad, puedes ingresar")
        }else{
            println("${nombre} eres menor de edad, No puede ingresar")
        }
    }
}