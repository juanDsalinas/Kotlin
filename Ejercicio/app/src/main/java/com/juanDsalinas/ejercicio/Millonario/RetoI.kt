package com.juanDsalinas.ejercicio.Millonario

class RetoI {

}

fun main(){
    // Reto
    println("digita tu edad")
    var edad:Int= readLine()!!.toInt()
    when(edad){
        in 0..4->println("entras gratis")
        in 5..17 -> println("paagas 20000 por tu entrada")
        in 18..60 -> println("pagas 15000 por tu entrada")
        in 61..120 ->  println("pagas 3000 por tu entrada")
        else -> println("edad invalida")
    }
}