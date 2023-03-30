package fiuza.maicon.basestudy.aula9

class ExampleOne(
    val idade: Int,
    val name: String
) {
    companion object {
        fun createExample(): ExampleOne {
            return ExampleOne(33, "Mauricínho")
        }
    }
}

class ExampleTwo(
    val idade: Int,
    val name: String
) {
    fun createExample(): ExampleTwo {
        return ExampleTwo(25, "Fernanda")
    }
}

fun main() {
    val objectTwo = ExampleTwo(27, "Fifiuza").createExample()


    //Com o companion object não preciso criar uma instância da classe pra acessar o que está no companion
    ExampleOne.createExample()
}