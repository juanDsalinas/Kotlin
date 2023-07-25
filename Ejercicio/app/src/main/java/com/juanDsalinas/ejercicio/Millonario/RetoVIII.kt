package com.juanDsalinas.ejercicio.Millonario

class RetoVIII {
}

fun main() {
    // RetoIV
    var res: String = "si"
    while (res == "si") {
        println("por favor digite el valor de su compra")
        var valor: Int = readLine()!!.toInt()
        if (valor > 50000) {
            println("felicidades salieste beneficiado gracias a nuestro aniversario \n")
            val bolita = 1..4
            var number = bolita.random()
            when (number) {
                1 -> println("Obtuviste la bolita roja, ganaste 10% de descuento \n")
                2 -> println("Obtuviste la bolita azul, ganaste 20% de descuento \n")
                3 -> println("Obtuviste la bolita amarrilla, ganaste 50% de descuento \n")
                4 -> println("Obtuviste la bolita blanca, te llevas tu compra gratis \n")
            }

            when (number) {
                1 -> println("pagas ${valor - ((valor * 10) / 100)} \n")
                2 -> println("pagas ${valor - ((valor * 20) / 100)} \n")
                3 -> println("pagas ${valor - ((valor * 50) / 100)} \n")
                4 -> println("Es gratis \n")
            }
        } else {
            println("por favor pagar ${valor} \n")
        }

        println("deseas seguir - si o no \n")
        res = readLine()!!.toString()
    }
}