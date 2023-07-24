package com.juanDsalinas.ejercicio.Retos

class Reto {
}

fun main(){
    // println("Hello world")
    // RetoI
    // var clientes = listOf(10,20,30,80,60)
    // for((index,element) in clientes.withIndex()){
    //   when(element){
    //  	in 0..4 -> println("cliente ${index} puedes entrar gratis")
    // 	in 5..17 -> println("cliente ${index} debes pagar 20000")
    // 	in 18..60 -> println("cliente ${index} debes pagar 15000")
    // 	in 61..150 -> println("cliente ${index} debes pagar 3000")
    //   }
    // }

    // RetoII
    // var res:Int=0
    // println("cuantas veces deseas jugar \n")
    // var people:Int=readLine()!!.toInt()
    // repeat(people){
    //     println("ingresa tu resultado jugador \n")
    //     var res:Int= readLine()!!.toInt()
    //     res=res/3
    //     println("¿este es tu resultado ${res}? - escribe si o no \n")
    //     var user:String=readLine()!!.toString()
    //     if(user.equals("si")){
    //         println("Soy todo un adivino \n")
    //     } else {
    //         println("Rectifica las cuentas te daras cuenta de que no me equivoco \n")
    //     }
    // }

    // RetoIII
    // val number = 1..6
    // var dado1=number.random()
    // var dado2=number.random()

    // println("${dado1}  ${dado2}")

    // var res:String="si"
    // while(res.equals("si")){
    //     if(dado1==1 && dado2==1){
    //         println("Ganaste")
    //     } else if(dado1+dado2==3){
    //         println("Ganaste")
    //     } else if(dado1+dado2==11){
    //         println("Ganaste")
    //     } else if(dado1+dado2==11 || dado1+dado2==2){
    //         println("Ganaste")
    //     } else if(dado1+dado2==7){
    //         println("Ganaste")
    //     } else {
    //         println("Perdiste")
    //     }
    //     println("Deseas seguir jugando \n")
    //     res=readLine()!!.toString()
    // }

    // RetoIV
    var res:String="si"
    while(res=="si"){
        println("por favor digite el valor de su compra")
        var valor:Int=readLine()!!.toInt()
        if(valor > 50000){
            println("felicidades salieste beneficiado gracias a nuestro aniversario \n")
            val bolita = 1..4
            var number=bolita.random()
            when(number){
                1 ->println("Obtuviste la bolita roja, ganaste 10% de descuento \n")
                2 ->println("Obtuviste la bolita azul, ganaste 20% de descuento \n")
                3 ->println("Obtuviste la bolita amarrilla, ganaste 50% de descuento \n")
                4 ->println("Obtuviste la bolita blanca, te llevas tu compra gratis \n")
            }

            when(number){
                1 ->println("pagas ${valor-((valor*10)/100)} \n")
                2 ->println("pagas ${valor-((valor*20)/100)} \n")
                3 ->println("pagas ${valor-((valor*50)/100)} \n")
                4 ->println("Es gratis \n")
            }
        } else {
            println("por favor pagar ${valor} \n")
        }

        println("deseas seguir - si o no \n")
        res=readLine()!!.toString()
    }
}