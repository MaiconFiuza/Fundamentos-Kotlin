package fiuza.maicon.basestudy.aula6

fun main() {
    println(StartWithHi("oi te liguei deve tá com contatinho"))
}

fun whenNormal() {
    var x = 8

    when(x) {
        5 -> println("x é igual a 5")
        7 -> println("X é igual a 7")
        else -> {
            println("X não corresponde a 5 e nem a 7")
            x++;
            println(x)
        }
    }
}

fun whenComDuasValidacoesJuntas() {
    var x = 1

    when(x) {
        1, 2 -> println("O x é menor que 3")
        else -> print("O x é menor que 2")
    }
}

fun withComRange() {
    val x = 9
    when(x) {
        in 1 .. 10 -> println("O x está no range de 1 a 10")
        else -> println("O x é maior do que 10")
    }
}

fun StartWithHi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}
