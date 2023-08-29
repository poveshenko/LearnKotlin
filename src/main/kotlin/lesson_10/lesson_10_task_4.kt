package lesson_10

fun main() {
    var play = "Да"
    var playerWins = 0
    var round = 1
    while (play.equals("Да", ignoreCase = true)) {
        println("Раунд - $round\n------")
        val player = playerTurn()
        val computer = computerTurn()
        if (player > computer) {
            playerWins++
        }
        round++
        print("Хотите бросить кости еще раз? (Да/Нет): \n")
        play = readln()
    }
    println("Количество выигранных партий игроком: $playerWins")
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