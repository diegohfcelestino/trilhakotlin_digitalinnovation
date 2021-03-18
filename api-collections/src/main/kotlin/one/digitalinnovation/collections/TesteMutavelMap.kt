package one.digitalinnovation.collections

fun main() {
    val lucas = Funcionario("Lucas", 3000.0, "CLT")
    val tarcisio = Funcionario("Tarcisio", 2500.0, "PJ")
    val julia = Funcionario("Julia", 5000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(lucas.nome, lucas)
    repositorio.create(tarcisio.nome, tarcisio)
    repositorio.create(julia.nome, julia)

    //imprimir um
    println(repositorio.findById(lucas.nome))

    println("---------------")

    //imprimir todos
    repositorio.findAll().forEach { println(it) }

    println("---------------")

    //passar um que não será impresso
    repositorio.remove(julia.nome)
    repositorio.findAll().forEach { println(it) }
}
