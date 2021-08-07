package me.vinicius

fun main() {
    val vinicius = Funcionario ("Vinicius", 2000.0, "CLT")
    val raquel = Funcionario ("Raquel", 1600.0, "PJ")
    val davi = Funcionario ("Davi", 3000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(vinicius.nome, vinicius)
    repositorio.create(raquel.nome, raquel)
    repositorio.create(davi.nome, davi)

    println(repositorio.findById(vinicius.nome))
}