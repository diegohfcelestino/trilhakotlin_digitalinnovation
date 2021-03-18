package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1500.0
    salarios[1] = 5000.0
    salarios[2] = 900.00

    //aqui é a iteração lambida
    salarios.forEach {
        println(it)
    }
    println("-------------------------")

    //aqui estamos iterando acrescentando 10% de salario com expressão lambida
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }
    println("-------------------------")

    //aqui inicializamos com valor e já fizemos a ordenação com o sort
    val salarios2 = doubleArrayOf(1950.0, 6250.0, 1800.0)
    salarios2.sort()
    salarios2.forEach { println("Os salarios2 são: " + it) }


}

