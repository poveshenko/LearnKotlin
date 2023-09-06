package lesson_13

class ContactPart2(val name: String, val number: Long, val company: String? = null) {

    fun printInfo() {
        println("Имя: $name\nНомер: $number\nКомпания: $company")
    }
}

fun main() {
    val contact = ContactPart2("Ростислав", 89123456789, "не указано")
    contact.printInfo()
}