package lesson_3

fun main() {
    val information = "D2-D4;0"
    val whence = information.split("-", ";")
    println("Сервер принял данные: $information")
    println("Откуда: ${whence[0]}")
    println("Куда: ${whence[1]}")
    println("Номер хода: ${whence[2]}")
}