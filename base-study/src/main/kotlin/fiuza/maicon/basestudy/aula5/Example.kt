package fiuza.maicon.basestudy.aula5

fun printNumbers() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun printOthersNumbers() {
    for (numero  in 10 downTo 1) {
        println(numero)
    }
}

fun stepNumbers() {
    for (numero in 1 .. 100 step 2) {
        println(numero)
    }
}

fun testeWh() {
    var numero = 10
    while (numero >= 0) {
        println(numero)
        numero--
    }
}

fun testeDoWh() {
    var numero = 0
    do {
        println(numero)
        numero++
    } while (numero <= 10)
}

fun main() {
    testeDoWh()
}
