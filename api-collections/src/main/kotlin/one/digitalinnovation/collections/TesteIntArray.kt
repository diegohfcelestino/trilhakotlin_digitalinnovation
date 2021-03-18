package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //aqui declaramos explicitamente
    for (valor in values) {
        println(valor)
    }
    println("--------------")

    //aqui usamos uma expressão lambida
    values.forEach { valor ->
        println(valor)
    }
    println("--------------")

    //aqui estamos iterando sobre os indeces de cada array
    for (index in values.indices) {
        println(values[index])
    }
    println("--------------")

    //aqui colocamos para ordenar do maior para o menor (sort) antes de printar
    values.sort()
    for (valor in values) {
        println(valor)
    }
}