package lesson_6

fun main() {
    println("Введите цифру")
    var second = readln().toInt()
    while (second>0) {
        Thread.sleep(1000)
        println("${second--} секунд")
    }
    println("Прошло $second секунд")

}