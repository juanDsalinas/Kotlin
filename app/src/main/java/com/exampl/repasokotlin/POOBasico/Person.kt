package com.exampl.repasoKotlin.POOColaboracion

class Person {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("Nombre: ${nombre} y edad: ${edad}")
    }

    fun mayorEdad(){
        if (edad >= 18){
            println("${nombre} usted es mayor de edad, Puedes ingresar")
        }else{
            println("${nombre} usted es menor de edad, Puedes ingresar")
        }
    }

    fun captuData(){
        println("Ingrese su nombre")
        nombre = readLine().toString()
        println("Ingrese su edad")
        edad = readLine()!!.toInt()
    }
}