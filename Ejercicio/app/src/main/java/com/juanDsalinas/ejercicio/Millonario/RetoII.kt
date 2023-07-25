package com.juanDsalinas.ejercicio.Millonario

class RetoII {
}

fun main(){
    // Reto
    println("digita un numero")
    var num:Int = readLine()!!.toInt()
    println("ahora sumale 5 y al resultado multiplicalo por 3")
    var res:Int=((num+5)*3)-15
    println("el resultado es ${res}")

    println("ingresa el resultado obtenido")
    var userR:Int = readLine()!!.toInt()
    res= userR/3
    println("tu numero es ${res}")
    println("el numero es correcto")
    var user=readLine()
    if(user.equals("si")){
        println("Soy todo un adivino")
    } else {
        println("rectifica las cuentas te daras cuenta que no me equivoca")
    }




}