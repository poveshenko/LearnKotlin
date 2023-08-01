package lesson_6


fun main() {
    var count = 5
    val n = (1..9).random()
    while (count >= 0) {
        val number = readln().toInt()
        if (number == n) {
            println("Это велеколепная игра!")
            break
        } else println("Не верно, осталось ${count--} попыток")
    }
    println("\nБыло загадано число $n")
}