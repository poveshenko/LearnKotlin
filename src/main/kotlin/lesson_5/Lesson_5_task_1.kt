package lesson_5

fun main() {
    println("Докажите что вы не БОТ\nСложите 2 числа:")
    val number = readln().toInt()
    val numberTwo = readln().toInt()
    when (number) {
        +numberTwo -> println("Добро пожаловать!")
        else -> println("Доступ запрещен!")
    }
}
