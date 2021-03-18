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

/*
fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}
 */