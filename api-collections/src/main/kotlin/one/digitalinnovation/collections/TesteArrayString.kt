package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Gabriel"
    nomes[1] = "Diego"
    nomes[2] = "Douglas"

    for (nome in nomes) {
        println(nome)
    }
    println("--------------")

    //Ordenar
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("--------------")

    //outra forma de declarar
    val nomes2 = arrayOf("Joao", "Jose", "Adao")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}

/*
fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}

 */