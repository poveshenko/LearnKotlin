package Lesson_5

fun main() {
    println("Докажите что вы не БОТ\nСколько будет 2+2?${2 + 2}")
    val number = readln().toInt()
    if (number == 4)
        println("Добро пожаловать!")
    else println("Доступ запрещен!")
}
