package lesson_3

fun main() {
    val player = "D2::D4::0"
    val server: List<String> = player.split("::")
    println("Сервер принял данные: $server")
    val whence = server[0]
    val where = server[1]
    val moveNumber = server[2]
    println("Откуда: $whence")
    println("Куда: $where")
    println("Номер хода: $moveNumber")
}