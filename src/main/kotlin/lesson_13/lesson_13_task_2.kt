package lesson_13

class ContactPart2(val name: String, val number: Long, val company: String? = null) {

    fun printInfo() {
        val _company = company ?: "не указано"
        println("Имя: $name\nНомер: $number\nКомпания: $_company")
    }
}

fun main() {
    val contact = ContactPart2("Ростислав", 89123456789)
    contact.printInfo()
}