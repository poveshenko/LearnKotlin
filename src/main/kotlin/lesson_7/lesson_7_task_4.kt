package lesson_7

fun main() {
    println("Введите количество секунд")
    val second = readln().toInt()
    for (i in second downTo 1) {
        Thread.sleep(1000)
        println("$i секунд")
    }
    println("\nВремя вышло")
}