package one.digitalinnovation.digionebank

abstract class Pessoa(
    val nome: String = "Diego",
    val cpf: String = "123.123.123-12"
)

fun main() {
    val diego =  Pessoa()

    println(diego.nome)
    println(diego.cpf)
}

