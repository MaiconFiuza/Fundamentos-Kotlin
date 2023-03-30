package fiuza.maicon.basestudy.aula8

import fiuza.maicon.basestudy.aula7.People

fun main() {

    var mapzada = mapOf("Maicon" to 27, "Isac" to 23)
    println(mapzada)

    var listinha = listOf<Int>(1, 2, 3)
    println( listinha.get(1))
   var dobro =  listinha
        .filter { it % 2 == 0 }
   println(dobro)

    var doubrinho = listinha.findLast { it % 2 == 1 }
    println(doubrinho)

    var listrona = mutableListOf<Int>(5, 8, 10)
    listrona.add(0, 55)


    println(listrona.sort())

    listrona.forEach{ println(it) }
    listinha.forEach{ println(it) }
}

data class People(
    val name: String,
    val idade: Int
) {

}