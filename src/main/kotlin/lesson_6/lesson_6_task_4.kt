package lesson_6


fun main() {
    val randomNumber = (1..9).random()
    var count = 5
    while (count >= 0) {
        val number = readln().toInt()
        if (number == randomNumber) {
            println("Это велеколепная игра!")
            break
        } else println("Не верно, осталось ${--count} попыток")
    }
    println("\nБыло загадано число $randomNumber")
}


