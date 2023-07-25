package com.juanDsalinas.ejercicio.Millonario

class RetoIII {

}

fun main(){
    // RetoIII
    val number = 1..6
    var dado1=number.random()
    var dado2=number.random()

    println("${dado1}  ${dado2}")
    if(dado1==1 && dado2==1){
        println("Ganaste")
    } else if(dado1+dado2==3){
        println("Ganaste")
    } else if(dado1+dado2==11){
        println("Ganaste")
    } else if(dado1+dado2==12 || dado1+dado2==2){
        println("Ganaste")
    } else if(dado1+dado2==7){
        println("Ganaste")
    } else {
        println("Perdiste")
    }
}



