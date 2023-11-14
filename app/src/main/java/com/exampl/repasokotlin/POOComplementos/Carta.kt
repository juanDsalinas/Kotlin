package com.AngelB6.poo2687391.POOComplementos

class Carta (val tipoCarta: DatosCartas, val numeroCarta:Int){
    fun imprimir(){
        println("Carta $tipoCarta valor: $numeroCarta")
    }
}

fun main (){

    val carta=Carta(DatosCartas.values().random(),1)
    val carta1=Carta(DatosCartas.diamante,1)
    val carta2=Carta(DatosCartas.trebol,2)
    carta1.imprimir()
    carta.imprimir()

}