package lesson_10

fun main() {
    var login = getLogin()
    login = checkLogin(login)

    val password = generatePassword()
    authorizeUser(login, password)
    var newPass: Int
    do {
        newPass = generatePassword()
        val inputCode = readln().toInt()
        if (inputCode == newPass) {
            println("Вы авторизованы! Добро пожаловать!")
            return
        } else {
            println("Неверный код")
            println("Сейчас придет смс сообщение, введите код")
        }
    } while (true)
}

fun getLogin(): String {
    println("Введите ваш новый логин:")
    return readln()
}

fun checkLogin(login: String): String {
    var newLogin = login
    while (newLogin.length < 4) {
        println("Логин, меньше 4 символов")
        newLogin = getLogin()
    }
    return newLogin
}


fun generatePassword(): Int {
    val password = (1000..9999).random()

    println("Ваш пароль: $password")
    return password
}

fun authorizeUser(login: String, password: Int) {
    do {
        println("Введите логин и пароль")
        val inputLogin = readln()
        val inputPassword = readln().toInt()
        if (inputLogin == login && inputPassword == password) {
            println("Вы ввели верные данные\n")
            println("Сейчас придет смс сообщение, введите код")
            return
        } else {
            println("Попробуйте еще")
        }
    } while (true)
}