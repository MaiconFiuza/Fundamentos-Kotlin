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

fun main() {
   stepNumbers()
}
