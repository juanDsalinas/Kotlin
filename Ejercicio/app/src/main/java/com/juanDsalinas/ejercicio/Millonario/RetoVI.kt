package com.juanDsalinas.ejercicio.Millonario

class RetoVI {
}

fun main(){
     // RetoII
     var res:Int=0
     println("cuantas veces deseas jugar \n")
     var people:Int=readLine()!!.toInt()
     repeat(people){
         println("ingresa tu resultado jugador \n")
         var res:Int= readLine()!!.toInt()
         res=res/3
         println("¿este es tu resultado ${res}? - escribe si o no \n")
         var user:String=readLine()!!.toString()
         if(user.equals("si")){
             println("Soy todo un adivino \n")
         } else {
             println("Rectifica las cuentas te daras cuenta de que no me equivoco \n")
         }
     }
}