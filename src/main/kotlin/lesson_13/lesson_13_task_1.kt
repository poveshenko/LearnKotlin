package lesson_13

class phoneBook(
    val name: String,
    val number: Long,
    val company: String? = null
) {

}
fun main(){
    val phone = phoneBook("nokia",79785265897)
    println(phone.name)
    println(phone.number)
    println(phone.company)


}