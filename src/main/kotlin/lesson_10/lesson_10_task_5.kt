package lesson_10

fun main() {
    val login = getLogin()
    check(login)
    val password = getGeneratorPassword()
    authorization(password, login)
    var newPass = getGeneratorPassword()
    do {
        val inputCode = readln().toInt()
        if (inputCode == newPass) {
            Thread.sleep(1000)
            println("Вы авторизованы! Добро пожаловать!")
            return
        } else {
            Thread.sleep(1000)
            println("Неверный код")
            Thread.sleep(1000)
            println("Сейчас придет смс сообщение, введите код")
            newPass = getGeneratorPassword()
        }
    } while (true)
}

fun getLogin(): String {
    println("Регистрация\nВведите ваш новый логин:")
    return readln()
}

fun check(login: String) {
    do {
        if (login.length < 4) {
            println("Логин, меньше 4 символов")
        }
    } while (login.length < 4)
    Thread.sleep(1000)
    println("Ваш логин подходит")
}

fun getGeneratorPassword(): Int {
    val specialCharacters = (1000..9999).random()
    Thread.sleep(1000)
    println("Ваш пароль: $specialCharacters")
    return specialCharacters
}

fun authorization(password: Int, login: String) {
    do {
        Thread.sleep(1000)
        println("Введите логин и пароль")
        val inputLogin = readln()
        val inputPassword = readln().toInt()
        if (inputLogin == login && inputPassword == password) {
            Thread.sleep(1000)
            println("Вы ввели верные данные\n")
            Thread.sleep(1000)
            println("Сейчас придет смс сообщение, введите код")
            return
        } else {
            println("Попробуйте еще")
        }
    } while (true)
}