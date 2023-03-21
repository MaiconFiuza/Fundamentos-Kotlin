package fiuza.maicon.basestudy.aula7

fun main() {

    var name: String? = null
    var size = name?.length ?: 0

    if (name != null) {
        println(name.length)
    }

    val pessoa: People? = People("Fernanda", 25)
    print(pessoa!!.name)
    println(size)
}

data class People(
    val name: String,
    val idade: Int
)