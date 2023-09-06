package lesson_13

class ContactPart3(var name: String? = null, val number: Long? = null, val company: String? = null) {

    fun printInfo() {
        val _company = company ?: "[не указано]"
        val _number = number ?: "[не указано]"
        val _name = name ?: "[не указано]"


        println("Имя: $_name\nНомер: $_number\nКомпания: $_company\n")
    }
}

fun main() {

    val contact = listOf(
        ContactPart3("Ростислав", 89123456789, "Компания"),
        ContactPart3()
    )

    contact.forEach() {
        it.printInfo()
    }
}