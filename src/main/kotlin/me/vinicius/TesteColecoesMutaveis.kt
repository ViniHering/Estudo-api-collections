package me.vinicius

fun main() {
    val vinicius = Funcionario ("Vinicius", 2000.0, "CLT")
    val raquel = Funcionario ("Raquel", 1600.0, "PJ")
    val davi = Funcionario ("Davi", 3000.0, "CLT")

    val funcionarios = mutableListOf(vinicius, raquel)
    funcionarios.forEach{ println(it)}

    println("----------------------")
    funcionarios.add(davi)
    funcionarios.forEach{ println(it)}

    println("----------------------")
    funcionarios.remove(vinicius)
    funcionarios.forEach{ println(it)}

    println("-------- SET ---------")
    val funcionarioSet = mutableSetOf(raquel)
    //funcionarioSet.forEach{ println(it)}

    funcionarioSet.add(vinicius)
    funcionarioSet.add(davi)
    funcionarioSet.forEach{ println(it)}
}