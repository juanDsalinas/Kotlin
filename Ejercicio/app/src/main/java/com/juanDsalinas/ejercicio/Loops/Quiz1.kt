package com.juanDsalinas.ejercicio.Loops

class Quiz3 {
}

fun main() {
    do{
        var final: String = "desarrollo"
        var word = arrayOf("d", "e", "s", "a", "r", "r", "o", "l", "l", "o")

        var er:Int=0
        for (i in 0..9) {
            println("intenta adivinar una letra de la palabra secreta - Tienes 10 intentos")
            println("la palabra tiene que ver con la evolucion de las cosas - esta toda en minuscula")
            var intento: String = readLine()!!.toString().lowercase()
            for(j in 0.. 9){
                if (intento == word[j]) {
                    println("Felicidades encontraste una letra")
                    break
                } else {
                    er+=1
                }
            }
        }

        var exit:Boolean=false
        println("Ahora intenta adivinar la palabra completa")
        for (i in 1..3) {
            println("tienes ${i} intento para intentar escribir la palabra")
            var people: String = readLine()!!.toString()
            if (people == final) {
                println("Felicidades la encontraste")
                exit=true
                break
            } else {
                er+=1
            }
        }

        if(exit==true){
            println("Ganaste")
        } else {
            println("Perdiste")
        }

        println("¿Deseas volver a jugar?")
        var res= readLine()!!.toString().lowercase()
    }while(res=="si")

    println("Gracias por jugar")
}