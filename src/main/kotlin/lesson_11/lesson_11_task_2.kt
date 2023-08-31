package lesson_11


class User(
    val login: String,
    var password: Int,
    val mail: String,
    var bio: String = "",
    var bio2: Boolean = false
) {

    fun informationUser() {
        println("Информация о пользователе\n1.Login: $login\n2.Password: $password\n3.Mail: $mail\n4.Bio: $bio")
    }

    // Первый вариант сохранение
    fun saveBio() {
        println("Информация о пользователе сохранена в поле: 'bio' \n[$login, $password, $mail] ")
        bio2 = true
    }

    // Второй вариант сохранение
    fun readUserInfo() {
        println("Введите информацию о пользователе:")
        bio = readln()

    }


    fun changePassword() {
        println("Введите текущий пароль")
        var pas = readln().toInt()
        while (pas != this.password) {
            println("Неверный пароль. Введите текущий пароль")
            pas = readln().toInt()
        }
        println("Введите новый пароль")
        val passwordNew = readln().toInt()
        this.password = passwordNew
        println("Пароль изменен")
    }

    fun sendEmail(message: String) {
        println("Отправка электронной почты  от $login")
        println("Сообщение: $message")
    }
}

fun main() {
    val oneUser = User(
        login = "admin",
        password = 1234,
        mail = "admin@gmail.com",
    )
    oneUser.readUserInfo()
    oneUser.informationUser()
    oneUser.changePassword()
    oneUser.sendEmail("Hello world")
}