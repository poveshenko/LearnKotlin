package lesson_7

fun main() {
    println("Введите любое число")
    val number = readln().toInt()
    for (i in 0..number step 2) {
        println("Четное число: $i")
    }
}