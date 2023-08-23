package lesson_10

fun main() {
    result(computer = computerTurn(), player = playerTurn())
}

fun playerTurn(): Int {
    val actionPlayer = (1..6).random()
    println("Ход игрока: $actionPlayer")
    return actionPlayer
}

fun computerTurn(): Int {
    val actionComputer = (1..6).random()
    println("Ход компьютера: $actionComputer")
    return actionComputer

}

fun result(computer: Int, player: Int) {
    if (computer > player) {
        println("Победила машина")
    } else if (computer == player) {
        println("ничья")
    } else {
        println("Победило человечество")
    }
}