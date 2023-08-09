package lesson_8

fun main() {
//    val recipeOfBorsch =
//        arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
//    println("Что вы желаете найти? ")
//
//    var x = false;
//    for (i in recipeOfBorsch) {
//        val find = readln()
//i.contains(find)
//    println("Ингредиент: [$i] в рецепте есть.")
//
//}var find = readln()
    val arr = arrayOf("apple", "banana", "cherry")
    val find = readln()
    for (x in arr) {
        println("Ингредиент: [${find == x}]  в рецепте есть.")
        break
    }
}

