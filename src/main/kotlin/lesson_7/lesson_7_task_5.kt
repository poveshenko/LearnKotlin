package lesson_7

fun main() {
    val number: CharRange = '1'..'6'
    val smallLetters: CharRange = 'a'..'z'
    val capitalLetters: CharRange = 'A'..'Z'
    val generator = number + smallLetters + capitalLetters
    var password = ""
    println("Введите длину пороля")
    val length = readln().toInt()
    for (i in 1..length) {
        password += generator.random()
    }
    println(password)
}
