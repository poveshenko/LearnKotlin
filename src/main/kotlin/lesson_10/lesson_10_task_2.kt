package lesson_10

fun main() {
    check(userName = getName(), userPas = getPassword())
}

fun getName(): String {
    println("Введите ваш логин")
    return readln()
}

fun getPassword(): String {
    println("Введите ваш пароль")
    return readln()
}

fun check(userName: String, userPas: String) {

    if (userName.length >= MIN_LENGTH && userPas.length >= MIN_LENGTH) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }

}

const val MIN_LENGTH = 4