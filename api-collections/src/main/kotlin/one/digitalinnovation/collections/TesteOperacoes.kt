package one.digitalinnovation.collections

fun main() {
   val salarios = doubleArrayOf(1200.0, 2590.0, 5900.0)

   for (salario in salarios) {
       println(salario)
   }
    println("-------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("---------")

    //salarios maior que 2.550,00
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("---------")

    //imprimir a quantidade de elementos dentro de um renge de 2500 até 5500
    println(salarios.count { it in 2500.0..6500.0 })

    println("---------")

    //buscar algum valor especifico
    println(salarios.find { it == 1200.0 })
    println(salarios.find { it == 500.0 })

    println("---------")

    //buscar qualquer que seja o valor especico
    println(salarios.any { it == 2590.0 })
    println(salarios.any { it == 500.0 })
}
