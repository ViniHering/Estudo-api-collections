package me.vinicius

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Raquel"
    nomes[1] = "Vinicius"
    nomes[2] = "Devs"

    for (nome in nomes) {
        println(nome)
    }

    println("--------")

    nomes.sort()
    nomes.forEach {println(it)}

    println("--------")

    val nomes2 = arrayOf("Raquel2", "Vinicius2", "Devs2")
    nomes2.sort()
    nomes2.forEach { println(it) }
}