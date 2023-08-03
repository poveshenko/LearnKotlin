package lesson_7

import kotlin.random.Random

fun main() {
    do {
        val generatorKey = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $generatorKey\nВведите код ")
        val number = readln().toInt()
    } while (number != generatorKey)
    println("Добро пожаловать!")
}