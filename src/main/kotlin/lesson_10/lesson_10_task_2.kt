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
    if (userName.length >= 4 && userPas.length >= 4) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}