package com.juanDsalinas.ejercicio.Condicionales
import kotlin.math.*
class Ejercicio3 {

}

fun main(){
    // Condicionales
    // simples
    /*println("ingrese un numero")
    var numU= readLine()!!.toInt()
    if(numU < 10 && numU > 0){
        println("Usted Gano")
    } else {
        println("Usted Perdio")
    }*/

    // anidados
    /* println("Ingrese el nombre de la fruta")
     var nameF:String= readLine()!!.toString().lowercase()

     if(nameF == "manzana"){
         println("ingrese el color de la manzana")
         var colorF:String=readLine()!!.toString().lowercase()
         if(colorF == "rojo"){
             println("se puede comer la manzana")
         } else if(colorF=="verde"){
             println("manzana es para ensalda")
         } else {
             println("eligio un color de manzana incorrecto")
         }

     }else if(nameF=="fresa") {
         println("ingrese el tamaño de la fresa")
         var tallF: Int = readLine()!!.toInt()
         if (tallF <= 15) {
             println("fresa pequeña")
         } else if (tallF > 15) {
             println("fresa grande")
         } else {
             println("eligio un tamaño para la fresa incorrecto")
         }
     } else if(nameF == "uva"){
         println("ingrese el tipo de la uva")
         var tipoF:String = readLine()!!.toString().lowercase()
         if (tipoF == "chilena") {
             println("la libra de uva cuesta 10000 lb")
         } else if (tipoF=="nacional") {
             println("la libra de uva cuesta 8000 lb")
         } else {
             println("eligio un tamaño para la fresa incorrecto")
         }
     } else if(nameF.equals("queso")){
         println("Eligio una fruta incorrecta")
     } */

    // multiples
    /*println("Digite un numero")
    var num:Int= readLine()!!.toInt()
    if(num in 1..10){
        println("esta entre 1 y 10")
    } else if(num in 11..100){
        println("esta entre 11 y 10")
    } else {
        println("No se encuentra dentro del rango")
    }*/

    /*println("digite una letra")
    var letter:String= readLine()!!.toString().lowercase()
    if (letter in "a".."u"){
        // letter.rangeTo("aeiout")
        // letter in "aeiou"
        println("si esta")
    } else {
        println("No esta")
    }

    var van=1..10 step  2
    println(van)*/
    // println("Bienvenido, por favor digite su edad")
    // var edad:Int = readLine()!!.toInt()

    /*if(edad in 0..14){
        println("usted es muy joven")
    } else if (edad in 15..17){
        println("Usted en menor de edad no puede ingresar")
    } else if(edad in 18..100){
        println("Bienvenido, Disfrute")
    }*/

    /*var edad:Int=(1..50).random()

    when(edad){
        0->println("el numero es invalido")
        in 1..6->println("el numero esta entre 1 - 6")
        in 7..15 -> println("el numero esta entre 7 - 50")
        8,9,1,11 -> println("es numero se encuentra entre 8 - 11")
        else -> println("el numero se encuentra fuera del rango")
    }

    println(edad)*//*
    var res:Double=0.0
    println("digite el primer numero")
    var num1:Double=readLine()!!.toDouble()
    println("digite el segundo numero")
    var num2:Double= readLine()!!.toDouble()
    println("que operacion deseas realizar")
    var op:String= readLine()!!.toString().lowercase()
    when(op){
        "suma"-> res=num1+num2
        "resta"->res=num1-num2
        "multiplicacion"->res=num1*num2
        "division"->res=num1/num2
        // "potencia"->res=num1num2
        "potencia" -> res=num1.pow(num2)
        else -> println("operacion invalida")
    }

    println("el resultado de la operacion ${op} entre ${num1} y ${num2} es ${res}")*/


}