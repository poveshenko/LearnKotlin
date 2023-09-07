package lesson_13

class ContactPart4(var name: String? = null, val number: Long? = null, val company: String? = null) {

    fun printInfo() {
        val _company = company ?: "[не указано]"
        val _number = number ?: "[не указано]"
        val _name = name ?: "[не указано]"

        println("Имя: $_name\nНомер: $_number\nКомпания: $_company\n")
    }

    fun info(name: String? = null, number: Long?, company: String? = null) {
        println("Новый контакт:\nИмя: $name\nНомер: $number\nКомпания: $company\n")
    }
}

fun main() {
    val contact = ContactPart4()
    contact.printInfo()
    while (true) {
        println("Если хотите добавить новый  контакт, введите \"да\"")
        val action = readln()
        if (action.equals("да", ignoreCase = true)) {
            println("Введите имя:")
            var newName = readln()
            if (newName == "") {
                newName = "null"
            }
            println("Введите номер:")
            val newNumber = readln().toLong()
            println("Введите компанию:")
            var newCompany = readln()
            if (newCompany == "") {
                newCompany = "null"
            }
            contact.info(newName , newNumber, newCompany)
        } else {
            break
        }
    }
}