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
            for (i in 3 downTo 0) {
                val number = (1..9).random()
                val numberTwo = (1..9).random()
                println("${number}+${numberTwo}=")
                val unswer = readln().toInt()
                when (unswer) {
                    number + numberTwo -> {
                        println("Добро пожаловать! ")
                        break
                    }
                    else -> println("Осталось $i попытка")
                }
                if (i == 0) {
                    println("Доступ запрещен")
                    break
                }
            }
        } else println("Не верный логин или пороль")
    } while (userName != login || password != passwordNew)
}

