package lesson_10

fun main() {
    generatorPass(userPas = getLength())
}

fun getLength(): Int {
    println("Введите длину пороля")
    return readln().toIntOrNull() ?: getLength()
}

fun generatorPass(userPas: Int) {
    val specialCharacters = ('!'..'9')
    var password = ""
    for (i in 1..userPas) {
        password += specialCharacters.random()
    }
    println(password)
}