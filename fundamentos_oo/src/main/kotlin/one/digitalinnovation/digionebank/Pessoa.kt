package one.digitalinnovation.digionebank

abstract class Pessoa {
    var nome: String = "Diego"

    var cpf: String = "123.123.123-12"
    private set
}

fun main () {
    val diego = Pessoa()

    println(diego)
    println(diego.nome)
    println(diego.cpf)
}

