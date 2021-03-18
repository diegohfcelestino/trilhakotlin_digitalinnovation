package one.digitalinnovation.collections

fun main() {
    val lucas = Funcionario("Lucas", 3000.0, "CLT")
    val tarcisio = Funcionario("Tarcisio", 2500.0, "PJ")
    val julia = Funcionario("Julia", 5000.0, "CLT")

    println("-- LIST --")
    val funcionarios = mutableListOf(lucas, tarcisio)
    funcionarios.forEach { println(it) }

    println("-----ADD----")

    funcionarios.add(julia)
    funcionarios.forEach { println(it) }

    println("-----REMOVE----")

    funcionarios.remove(lucas)
    funcionarios.forEach { println(it) }

    println("--- SET ---")

    val funcionarioSet = mutableSetOf(lucas)
    funcionarioSet.forEach { println(it) }

    println("-----ADD----")

    funcionarioSet.add(tarcisio)
    funcionarioSet.add(lucas)
    funcionarioSet.forEach { println(it) }

    println("-----REMOVE----")

    funcionarioSet.remove(julia)
    funcionarioSet.forEach { println(it) }

}