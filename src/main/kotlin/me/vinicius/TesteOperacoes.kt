package me.vinicius

fun main() {

    val salarios = doubleArrayOf(1000.0, 2000.0, 4000.0, 5000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------------------------------------")


    //mostrando o maior valor
    println("Maior salário: ${salarios.maxOrNull()}")

    println("------------------------------------------------------")


    //mostrando o menor valor
    println("Menor salário: ${salarios.minOrNull()}")

    //mostrando o valor médio
    println("Media salarial: ${salarios.average()}")

    // filtrando salários

    println("------------------------------------------------------")

    println("Salários que são maiores que 2,5k")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{
        println(it) }

    println("testando")
    println("------------------------------------------------------")

    // Quantos elementos tenho dentro do Array que estão entre 2k e 5k
    println("Numero de Elementos(Salários) no array entre 2k e 5k")
    println(salarios.count{it in 2000.0..5000.0})

    println("------------------------------------------------------")

    //imprimir um elemento exato
    println("Numero exato: ${salarios.find { it == 4000.0 }}")
    println("Numero exato não encontrado: ${salarios.find { it == 700.0 }}")

    println("------------------------------------------------------")

    // imprime se o valor existe dentro do Arrays com True e False
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 2600.0}) //este Elemento(Salario) não existe no Arrays
}