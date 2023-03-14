package fiuza.maicon.basestudy.aula1

data class People(
    val name: String,
    val years: Int
) {
    override fun toString(): String {
        return "Meu nome é ${name}, minha idade é ${years}"
    }
}

fun main() {
    val people = People("Maicon", 27);
    println(people.toString())
}
