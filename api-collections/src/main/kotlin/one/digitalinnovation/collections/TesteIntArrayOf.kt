package one.digitalinnovation.collections


//intArrayOf é mais flexivel para acrescentar itens ao array
fun main() {
    val values = intArrayOf(6, 5, 3, 7, 15, 10)

    values.forEach {
        println(it)
    }
    println("---------------------")

    //aqui ordenamos para printar
    values.sort()
    values.forEach {
        println(it)
    }
}
