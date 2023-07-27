package lesson_5

import java.util.*

fun main() {
    //Генератор случайных чисел
    val random = Random()
    val winnerNumberTwo = random.nextInt(100)
    val winnerNumberONe = random.nextInt(100)
    //Ввод данных
    println("Введите число")
    val numberOne = readln().toInt()
    println("Введите второе число")
    val numberTwo = readln().toInt()
    if (numberOne == winnerNumberONe && numberTwo == winnerNumberTwo)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == winnerNumberONe || numberTwo == winnerNumberTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    // Результат
    println("Выйгрышные числа: $winnerNumberONe и $winnerNumberTwo")

}
