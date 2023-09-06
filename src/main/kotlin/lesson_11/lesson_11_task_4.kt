package lesson_11

class Contact(
    val icon: String,
    val iCloudMail: String,
    val phoneNumber: Long,//String
    val homeNumber: Long,
    val contactPhone: List<String>
) {

    fun information() {
        println("Экран телефона:\n1 - $icon\n2 - $iCloudMail\n3 - $phoneNumber\n4 - $homeNumber\n5 - $contactPhone")
    }
}

fun main() {
    val phone = Contact(
        icon = "img.jpg",
        iCloudMail = "mail@mail.ru",
        phoneNumber = 89999994242,//8(999)999-42-42 или нужно так?
        homeNumber = 89999994242,
        contactPhone = listOf("Жена", "Подруга", "Подруга")
    )
    phone.information()
}