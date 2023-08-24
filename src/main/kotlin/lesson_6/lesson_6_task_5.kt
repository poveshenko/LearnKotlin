package lesson_6

fun main() {

//   Регистрация пользователя
    println("Пожалуйста зарегистрируйтесь:")
    Thread.sleep(1000)
    println("Введите логин")
    val userName = readln()
    println("Введите пороль")
    val password = readln()
    Thread.sleep(1000)
    println("Вы зарегистрированы!")

//Вход в приложение
    do {
        println("Введите логин")
        val login = readln()
        println("Введите пороль")
        val passwordNew = readln()
        Thread.sleep(1000)
        if (userName == login && password == passwordNew) {

            //Капча
            println("Докажите что вы не БОТ\nСложите 2 числа:")
            var i = 3
            do {
                val number = (1..9).random()
                val numberTwo = (1..9).random()
                println("${number}+${numberTwo}=")
                val answer = readln().toInt()
                if (answer == number + numberTwo) {
                    println("Добро пожаловать! ")
                    break
                } else {
                    i--
                    if (i == 0) {
                        println("Доступ запрещен")
                        break
                    } else {
                        println("Осталось $i попытка")
                    }
                }
            } while (true)
        } else {
            println("Неверный логин или пароль")
        }
    } while (userName != login || password != passwordNew)
}

