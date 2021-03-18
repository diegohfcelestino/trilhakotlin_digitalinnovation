package one.digitalinnovation.collections

fun main() {
    val lucas = Funcionario("Lucas", 3000.0, "CLT")
    val tarcisio = Funcionario("Tarcisio", 2500.0, "PJ")
    val julia = Funcionario("Julia", 5000.0, "CLT")

    //aqui separamos os funcionarios por set (conjuntos)
    val funcionarios1 = setOf(lucas, tarcisio)
    val funcionarios2 = setOf(julia)

    //abaixo estamos unindo os dois sets e imprimindo o resultado da união
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {
        println(it)
    }

    println("----------")

    //aqui retiramos o que tem de comum nos dois conjuntos
    val funcionarios3 = setOf(lucas, tarcisio, julia) //criamos o conjunto 3
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {
        println(it)
    }

    println("-----------")

    //aqui lista apenas o que tem em comum nos dois conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}
