package com.exampl.repasoKotlin.POOColaboracion

fun main() {

    val Cliente = Client()
    var id = mutableListOf<Int>()
    var clientes = mutableListOf<String>()
    var numDoc = mutableListOf<Int>()
    var saldoC = mutableListOf<Float>()

    var res: String="no"
    var idUsuario: Int


    println("Cuantos clientes desea registrar")
    var cliCant:Int = readLine()!!.toInt()
    for (i in 1 .. cliCant){
        println("Nombre del cliente")
        var nomClie: String = readLine().toString()
        clientes.add(nomClie)
        println("Numero de documento del cliente")
        var numClie: Int = readLine()!!.toInt()
        numDoc.add(numClie)
        println("Saldo del cliente")
        var saldo: Float = readLine()!!.toFloat()
        saldoC.add(saldo)
        println("Tu ID es: ${i}")
        id.add(i-1)
    }
    println("Se registraron los clientes satisfactoriamente :)")


    do {
        println("¿Que Deseas hacer?\n1. Consignar\n2. Retirar\n3. Consultar Saldo\n4. Salir")
        var seleccion:Int = readLine()!!.toInt()
        when (seleccion){

            1 ->{
                println("Por favor ingrese su ID de usuario:")
                idUsuario = readLine()!!.toInt()
                idUsuario-=1
                if (idUsuario == id[idUsuario]) {
                    println("Bienvenido, tu  saldo es ${saldoC[idUsuario]}")
                    saldoC[idUsuario]=Cliente.consignar(saldoC[idUsuario])
                    println("Trasaccion finalizada\nSu saldo final es: ${saldoC[idUsuario]}")
                }else{
                    println("ID invalido, vuelve a intentarlo")
                }
            }

            2 ->{
                println("Ingrese su ID de usuario:")
                idUsuario = readLine()!!.toInt()
                idUsuario-=1
                if (idUsuario == id[idUsuario]) {
                    println("Bienvenido ${clientes[idUsuario]}\nSu numero de documento es: ${numDoc[idUsuario]} y su saldo es ${saldoC[idUsuario]}")
                    saldoC[idUsuario]= Cliente.retirar(saldoC[idUsuario])!!
                    println("Trasaccion finalizada\nSu saldo final es: ${saldoC[idUsuario]}")
                }else{
                    println("Su ID de usuario no fue encontrado. Por favor vuelva a intentarlo")
                }
            }

            3 ->{
                println("Usted seleccion la opcion consultar saldo\nPor favor ingrese su ID de usuario:")
                idUsuario = readLine()!!.toInt()
                idUsuario-=1
                if (idUsuario == id[idUsuario]) {
                    println("Bienvenido ${clientes[idUsuario]}\nSu numero de documento es: ${numDoc[idUsuario]} y su saldo es ${saldoC[idUsuario]}")
                }else{
                    println("Su ID de usuario no fue encontrado. Por favor vuelva a intentarlo")
                }
            }

            4 ->{
                println("Usted selecciono la opcion salir\n¿Seguro desea salir? (Si - No)")
                res = readLine().toString().lowercase()
                val total = saldoC.sum()
                println("La suma de los saldos de las cuentas resgitradas son: ${total}")
                break

            }

            else -> println("Opcion incorrecta. Vuelve a intentarlo")
        }

        println("¿Desea salir de la aplicacion? Si - No")
        res = readLine().toString().lowercase()

    }

    while (res=="no")
}