package lesson_5

fun main() {
    println("Докажите что вы не БОТ\nСложите 2 числа:")
    val number = (1..9).random()
    val numberTwo = (1..9).random()
    println("${number}+${numberTwo}=")
    val unswer = readln().toInt()
    when (unswer) {
        number + numberTwo ->
            println("Добро пожаловать! ")
        else -> println("Доступ запрещен!")
    }
}
