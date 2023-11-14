package com.exampl.repasoKotlin.POOColaboracion

class Banco {
    val cliente1: Client = Client("Luisa", 0f)
    val cliente2: Client = Client("Luis", 0f)
    val cliente3: Client = Client("Pedro", 0f)

    fun movimientos(){
        cliente1.consignar(100000f)
        cliente2.consignar(250000f)
        cliente3.consignar(300000f)
        cliente3.retirar(180000f)
    }

    fun estadoCuenta(){
        val total= cliente1.saldoCuenta+cliente2.saldoCuenta+cliente3.saldoCuenta
        println("El saldo total en el banco es: ${total}")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}