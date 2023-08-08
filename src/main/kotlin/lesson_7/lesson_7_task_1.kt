package lesson_7

fun main() {

    val randomLetter = 'a'..'z'
    val letterOne = randomLetter
    val letterTwo = randomLetter
    val letterThree = randomLetter

    val number = 0..9
    var password = ""
    val generator = number+letterOne+letterTwo+letterThree
    for (i in 1..6) {
        password += generator.random()
    }
    println(password)
}



