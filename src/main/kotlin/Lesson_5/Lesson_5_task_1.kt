package Lesson_5

fun main() {
    println("Докажите что вы не БОТ\nСколько будет 2+2?")
    when (readln().toInt()) {
        2 + 2 -> println("Добро пожаловать!")
        else -> println("Доступ запрещен!")
    }
}