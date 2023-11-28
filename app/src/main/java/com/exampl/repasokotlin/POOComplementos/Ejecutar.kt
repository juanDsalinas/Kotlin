package com.AngelB6.poo2687391.POOComplementos

fun main(){
    val producto1=Producto(1,"cholao",20.0)
    val producto2=Producto(2,"fresitas",10.0)
    println(producto1.codigo)
    println(producto2)
    val seleccion = producto1
    seleccion.precio=30.0
    println(producto1)

    var producto3 = producto2.copy(3,producto1.descrip, 20.0)

    // other forma de hacerlo
    producto3.precio=40.0
    producto3.codigo=3
    println(producto3)



}