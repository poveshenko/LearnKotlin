package lesson_3

fun main() {
    println()
    val server = arrayOf("D2", ";", "D4", "-", "0")
    val text ="Сервер принял данные: "
    println(text + server[0] + server[1] + server[2] + server[3] + server[4])
    val whence = server[0]
    val where = server[2]
    val moveNumber = server[4]
    println("Откуда: $whence")
    println("Куда: $where")
    println("Номер хода: $moveNumber")
}