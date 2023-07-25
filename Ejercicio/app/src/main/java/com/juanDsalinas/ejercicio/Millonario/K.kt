package com.juanDsalinas.ejercicio.Millonario

class K {
}

fun main(){
    var pets=arrayOf(22,30,"maih")
    for(element in pets){
        println(element )
    }
    var cadena:String="Basado#"
    println(println("${cadena::class.simpleName}"))
    println("${pets.size}")

    // println(number(2))
}

// fun number(num:Int){
  // var res:Boolean = if(num%2==0) true else false
  //  return res
//}