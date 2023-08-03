package lesson_7

fun main() {
    println("Введите любое число")
    val number = readln().toInt()
    for (i in 0..number) {
        if (i % 2 == 0) {
            println("Четное число: $i")
            continue
        }

    }

}