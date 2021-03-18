package one.digitalinnovation.collections


//estanciamos separado para usar em dois arquivos
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}