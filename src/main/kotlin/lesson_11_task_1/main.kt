package lesson_11_task_1

fun main() {

    val oneUser = User(
        login = "admin",
        password = 1234,
        mail = "admin@gmail.com"
    )


    val twoUser = User(
        login = "system_admin",
        password = 4321,
        mail = "system_admin@gmail.com"
    )

    println(oneUser.login)
    println(oneUser.password)
    println(oneUser.mail)

    println()

    println(twoUser.login)
    println(twoUser.password)
    println(twoUser.mail)

}