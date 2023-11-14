package com.exampl.repasoKotlin.POOColaboracion

class Client {
    fun consignar(saldo: Float): Float {
        println("Cuanto desea consignar:")
        var cons: Float = readLine()!!.toFloat()
        var saldoFinal = cons + saldo
        return saldoFinal
    }

    fun retirar(saldo: Float): Float {
        var saldoFinal:Float =0f
        println("Cuanto retirar:")
        var cons: Float = readLine()!!.toFloat()
        if (cons <= saldo) {
             saldoFinal = saldo-cons
        }else{
            println("Fondos insuficientes")
            return saldo
        }
        if (saldoFinal != 0f){
            return saldoFinal
        }
        return TODO("Provide the return value")
    }
}