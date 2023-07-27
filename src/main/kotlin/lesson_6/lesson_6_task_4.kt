package lesson_6

import java.util.*

fun main() {
    var count = 4
    val random = Random()
    val n = random.nextInt(9) + 1
    while (count >= 0) {
        val number = readln().toInt()
        if (number == n) {
            println("Это велеколепная игра!")
            break
        } else println("Не верно, осталось $count попыток")
        count--
    }
    println()
    println("Было загадано число $n")
}