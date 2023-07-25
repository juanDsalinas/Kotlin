package com.juanDsalinas.ejercicio.Loops

class Quiz1 {
}

fun main(){
    var res:String="si"
        println("Una aplicacion se esta instalando en tu equipo")
        println("aplicacion instalada")
        var word = arrayOf("Downloads", "Desktop", "Imagenes")
        var name = arrayOf("app", "app1", "app2")
        var d:Int=(0..2).random()
        var hora:String="10:54"
        var ubicacion:String="C:/${word[d]}/${name[d]}"

        println("¿Desea utilizar la aplicacion?")
        var des= readLine()!!.toString().lowercase()
        if(des=="si"){
            println("El nombre de la app es ${name[d]}, su ubicacion es ${ubicacion}, la hora de instalacion es ${hora}")
        } else {
            println("aplicacion instalada correctamente")
        }

    while(res=="si") {
        println("¿Deseas seguir mostrando la app?")
        res= readLine()!!.toString().lowercase()
        println("El nombre de la app es ${name[d]}, su ubicacion es ${ubicacion}, la hora de instalacion es ${hora}")
    }

    println("Ten un lindo dia")

}