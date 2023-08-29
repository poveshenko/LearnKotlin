package lesson_10


fun main() {
    val playerScore = gameTurn("игрока")
    val computerScore = gameTurn("компьютера")
    result(computerScore, playerScore)
}

fun gameTurn(player: String): Int {
    val action = (1..6).random()
    println("Ход $player: $action")
    return action
}

fun result(computer: Int, player: Int) {
    if (computer > player) {
        println("Победила машина")
    } else if (computer == player) {
        println("Ничья")
    } else {
        println("Победило человечество")
    }
}