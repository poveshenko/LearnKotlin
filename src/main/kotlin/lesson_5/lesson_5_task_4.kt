package lesson_5

fun main() {
//Космический корабль "Heart of Gold"
    println("Введите имя")
    val login = readln()
    println("Введите пороль")
    val password = readln()
    if (login == USER_NAME && password == USER_PASSWORD) println("Ваши данные проверены..\nДобро пожаловать на борт - $login")
    else println("Просим вас зарегистрироваться")
}


//Бортовой пользователь
const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"