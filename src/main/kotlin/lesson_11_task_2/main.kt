package lesson_11_task_2

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