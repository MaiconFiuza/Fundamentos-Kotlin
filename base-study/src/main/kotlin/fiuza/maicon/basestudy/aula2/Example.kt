package fiuza.maicon.basestudy.aula2

data class Car(
    val brand: String,
    val licensePlate: String,
    val owner: People
) {}

data class People(
   val name: String,
   val cpf: String
)

fun main() {
    val newCar = Car("Chevolet", "abcd0870", People("Maicon", "0000000"))
    println(newCar)
}
