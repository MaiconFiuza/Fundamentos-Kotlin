package fiuza.maicon.basestudy.aula03

fun main(): Unit {
    println( hello())
}

fun hello(date: Int? = 27): String {
    return "Hello World ${date}"
}