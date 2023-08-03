package lesson_7

fun main() {
    val generatorPassword = "123456helloKOTLIN"
    var password = ""
    println("Введите длину пороля")
    val number = readln().toInt()
    for (i in 1..number) {
        password += generatorPassword.random()
    }
    println(password)
}
