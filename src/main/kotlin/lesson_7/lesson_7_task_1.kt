package lesson_7

fun main() {

    val letter = 'a'..'z'
    val number = 2..6
    var password = ""
    val generator = letter + number
    for (i in 1..6) {
        password += generator.random()
    }
    println(password)
}



