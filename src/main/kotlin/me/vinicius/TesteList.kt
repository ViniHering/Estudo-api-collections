package me.vinicius

fun main() {
    val vinicius = Funcionario ("Vinicius", 2000.0, "CLT")
    val raquel = Funcionario ("Raquel", 1600.0, "PJ")
    val davi = Funcionario ("Davi", 3000.0, "CLT")

    val  funcionarios = listOf(vinicius, raquel, davi)

    funcionarios.forEach{ println(it) }

    println("----------------------")

    println(funcionarios.find { it.nome == "Raquel" })

    println("----------------------")

    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("----------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}
}


