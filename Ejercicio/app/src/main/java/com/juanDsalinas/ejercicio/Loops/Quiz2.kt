package com.juanDsalinas.ejercicio.Loops

class Quiz2 {
}

fun main(){
    var cont:Int=0
    println("¿Deseas realizar un pqrs?")
    var des = readLine()!!.toString().lowercase()
    while (des == "si"){
        println("Bienvenido, esta realizando un pqrs")
        println("Digite su nombre")
        var nombre= readLine()!!.toString()
        println("Digite su numero de documento")
        var numeroD= readLine()!!.toString()
        println("Digite el tipo de pqrs que desea realizar")
        var pqr= readLine()!!.toString()
        println("Digite la descripcion de la pqrs")
        var desc= readLine()!!.toString()
        cont+=1
        println("tu pqrs quedo de la siguiente manera: \n Nombre : ${nombre} \n Numero de documento : ${numeroD} \n Tipo de pqrs : ${pqr} \n descripcion : ${desc}")
        println("¿Llevas ${cont} pqrs realizadas, deseas realizar otra?")
        des = readLine()!!.lowercase()

    }

    println("Gracias por visitar nuestra pagina")
}