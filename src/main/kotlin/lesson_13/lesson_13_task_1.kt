package lesson_13

class Contact(val name: String, val number: Int, val company: String?)

fun main() {
    // val contact = Contact("Валера", 123456789, "Компания 1")
    val contact = Contact("Петр", 987654321, null)
    println(contact.name)
    println(contact.number)
    println(contact.company)
}