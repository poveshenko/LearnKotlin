package lesson_6

fun main() {
    //Авторизация пользователя

    println("Пожалуйста зарегистрируйтесь:")
    Thread.sleep(1000)
    println("Введите логин")
    val userName = readln()
    println("Введите пороль")
    val password = readln()
    Thread.sleep(1000)
    println("Вы зарегистрированы!")
    do {
        println("Введите логин")
        val login = readln()
        println("Введите пороль")
        val passwordNew = readln()
        Thread.sleep(1000)
        if (userName == login && password == passwordNew) println("Авторизация прошла успешно!")
        else println("Не верный логин или пороль")
    } while (userName != login || password != passwordNew)
}