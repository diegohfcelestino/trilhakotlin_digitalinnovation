package one.digitalinnovation.collections

fun main() {
    //primeira forma de fazer um map
    val pair: Pair<String, Double> = Pair("Lara", 2000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("----------")

    //segunda forma de fazer um map
    val map2 = mapOf(
        "Eric" to 2800.0,
        "Aila" to 3900.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}
