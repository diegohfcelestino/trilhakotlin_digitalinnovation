package one.digitalinnovation.collections

fun main() {
    val lucas = Funcionario("Lucas", 3000.0, "CLT")
    val tarcisio = Funcionario("Tarcisio", 2500.0, "PJ")
    val julia = Funcionario("Julia", 5000.0, "CLT")

    val funcionarios = listOf(lucas, tarcisio, julia)

    funcionarios.forEach {
        println(it)
    }
    println("----------")

    println(funcionarios.find { it.nome == "Julia" })

    println("----------")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}
