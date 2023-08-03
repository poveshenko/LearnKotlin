package lesson_5

fun main() {
    println("Введите число")
    val numberOne = readln().toInt()
    println("Введите второе число")
    val numberTwo = readln().toInt()
    if (numberOne == WINNER_NUMBER_ONE && numberTwo == WINNER_NUMBER_TWO || numberOne == WINNER_NUMBER_TWO && numberTwo == WINNER_NUMBER_ONE)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == WINNER_NUMBER_ONE || numberTwo == WINNER_NUMBER_TWO || numberTwo == WINNER_NUMBER_ONE || numberOne == WINNER_NUMBER_TWO)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}

const val WINNER_NUMBER_ONE = 5
const val WINNER_NUMBER_TWO = 10