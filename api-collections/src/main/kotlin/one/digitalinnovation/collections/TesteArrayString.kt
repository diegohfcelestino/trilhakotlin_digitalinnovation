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
