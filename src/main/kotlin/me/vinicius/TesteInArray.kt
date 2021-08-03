package me.vinicius

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }

    println("\n")

    values.forEach {
        println(it)
    }

    println("\n")

// sort deixa em ordem crescente
    values.sort()
    for (valor in values) {
        println(valor)
    }
}