package me.vinicius

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("-------")
    
    salarios.sort()
    salarios.forEach { println(it) }

}