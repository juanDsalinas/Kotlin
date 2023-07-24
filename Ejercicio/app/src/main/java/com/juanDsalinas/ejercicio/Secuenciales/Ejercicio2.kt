package com.juanDsalinas.ejercicio.Secuenciales

import kotlin.math.roundToInt

class Ejercicio2 {
}

fun main (){
    // Reto II
    println("Digite el nombre del bebe")
    var name:String=readLine().toString().lowercase()

    println("Digite el peso del bebe en Kg")
    var pesoBebe=readLine()!!.toDouble()

    println("Digite en meses la edad del bebe")
    var mesesBebe=readLine()!!.toDouble()

    var dosis:Double=pesoBebe+10

    dosis=dosis+(mesesBebe*10)

    dosis=(dosis*8).roundToInt()/10.0

    println("para el bebe ${name} el cual pesa ${pesoBebe} Kg y su edad es de ${mesesBebe} meses, es recomendable una dosis de ${dosis} ml de vacuna")
}