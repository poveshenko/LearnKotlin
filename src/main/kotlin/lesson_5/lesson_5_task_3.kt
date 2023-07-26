package lesson_5

fun main() {
    println("Введите число")
    val numberOne = readln().toInt()
    println("Введите второе число")
    val numberTwo = readln().toInt()
    if (numberOne == winnerNumberOne && numberTwo == winnerNumberTwo)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == winnerNumberOne || numberTwo == winnerNumberTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}

const val winnerNumberOne = 5
const val winnerNumberTwo = 10