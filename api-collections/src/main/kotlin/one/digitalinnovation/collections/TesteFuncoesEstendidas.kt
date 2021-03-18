package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "3000".toBigDecimal(),
        "2500".toBigDecimal(),
        "6000".toBigDecimal()
    )

    println("-------Somatória-------")
    println(salarios.somatoria())

    println("--------Media-------")
    println(salarios.media())
}