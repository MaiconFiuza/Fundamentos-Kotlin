package fiuza.maicon.basestudy.aula04

import java.time.LocalDate

fun main() {
    var name = "Fiuza"
    name = "Fifiuza"
    val birthdate = LocalDate.now()
    val teste = Teste()


    println("Meu nome é ${name} eu nasci as ${birthdate}")
}

class Teste() {
    private lateinit var secondName: String
    fun iniciate() {
        secondName = "aiiiiii"
    }
}