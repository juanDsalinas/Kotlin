package com.exampl.repasoKotlin.POOColaboracion

class PersonaConstructor constructor(nombre:String, edad:Int){
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir(){
        println("Nombre: ${nombre} y edad: ${edad}")
    }

    fun mayorEdad(){
        if (edad >= 18){
            println("${nombre} eres mayor de edad, Puede ingresar.")
        }else{
            println("${nombre} eres menor de edad, Puede ingresar.")
        }
    }
}