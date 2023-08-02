package lesson_5

import kotlin.random.Random


fun main() {
    //Генератор случайных чисел

    val winnerNumberTwo = Random.nextInt(0, 100)
    val winnerNumberONe = Random.nextInt(0, 100)

    //Ввод данных
    println("Введите число")
    val numberOne = readln().toInt()
    println("Введите второе число")
    val numberTwo = readln().toInt()

    // Сравнение переменных
    if (numberOne == winnerNumberONe && numberTwo == winnerNumberTwo || numberOne == winnerNumberTwo && numberTwo == winnerNumberONe)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numberOne == winnerNumberONe || numberTwo == winnerNumberTwo || numberTwo == winnerNumberONe || numberOne == winnerNumberTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    // Результат
    println("Выйгрышные числа: $winnerNumberONe и $winnerNumberTwo")
}
