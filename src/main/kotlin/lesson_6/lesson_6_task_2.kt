package lesson_6

fun main() {
    // Таймер
    println("Введите цифру")
    var second = readln().toInt()
    while (second > 0) {
        Thread.sleep(1000)
        println("Прошло ${second--} секунд")
    }
}