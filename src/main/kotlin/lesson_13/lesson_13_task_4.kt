package lesson_13

class ContactPart4(var name: String? = null, val number: Long? = null, val company: String? = null) {

    fun printInfo() {
        val _company = company ?: "[не указано]"
        val _number = number ?: "[не указано]"
        val _name = name ?: "[не указано]"

        println("Имя: $_name\nНомер: $_number\nКомпания: $_company\n")
    }

    fun usefulFun(name: String? = null, number: Long, company: String? = null) {

        println("Новый контакт:\nИмя: $name\nНомер: $number\nКомпания: $company\n")
    }
}

    fun main() {
        val contact = ContactPart4()
        contact.printInfo()

        while (true) {
            println("Если хотите добавить новый  контакт, введите \"да\"")
            val x = readln()
            if (x.equals("да", ignoreCase = true)) {
                println("Введите имя:")
                val newName = readln()
                println("Введите номер:")
                val newNumber = readln().toLong()
                println("Введите компанию:")
                val newCompany = readln()
                contact.usefulFun(newName, newNumber, newCompany)
            } else {
                break
            }
        }
    }

//    val contact = listOf(
//        ContactPart3("Ростислав", 89123456789, "Компания"),
//        ContactPart3()
//    )
//
//    contact.forEach() {
//        it.printInfo()
//    }