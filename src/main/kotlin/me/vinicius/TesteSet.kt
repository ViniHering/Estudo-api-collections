package me.vinicius

fun main() {
    val vinicius = Funcionario ("Vinicius", 2000.0, "CLT")
    val raquel = Funcionario ("Raquel", 1600.0, "PJ")
    val davi = Funcionario ("Davi", 3000.0, "CLT")

    val funcionarios1 = setOf(vinicius, raquel)
    val funcionarios2 = setOf(davi)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("---------------------")
    val funcionarios3 = setOf(vinicius, raquel, davi)
    val resultSubtract = funcionarios1.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}
}