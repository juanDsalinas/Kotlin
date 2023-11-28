package com.exampl.repasoKotlin.POOColaboracion

class Persona {
    var nombre: String = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return field
        }
    var edad: Int = 0
        set(valor) {
            if (valor >= 0) {
                field = valor
            } else {
                field = 0
            }
        }
}

fun main() {
    val persona1 = Persona()
    persona1.nombre="Juan"
    persona1.edad=18
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad=-20
    println(persona1.edad)
}