package lesson_8

fun main() {
    val recipeOfBorsch = arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Чеснок", "Говядина", "Соль")
    for (i in recipeOfBorsch) {
        println("Ингредиент ${recipeOfBorsch.indexOf(i) + 1} $i")
    }
    do {
        println("\nЧто вы желаете найти? ")
        val find = readLine()
        var found = false
        for (n in recipeOfBorsch) {
            if (n.equals(find, ignoreCase = true)) {
                found = true
                println("Ингредиент: [$find] в рецепте есть.")
                break
            }
        }
        if (!found) {
            println("Такого ингредиента в рецепте нет.")
        }
    } while (!found)
    println("Введите индекс ингридиента для замены")
    val replaceIndex = readLine()!!.toInt()
    println("Введите ингредиент для замены")
    val replaceIngredient = readLine()
    recipeOfBorsch[replaceIndex - 1] = replaceIngredient.toString()
    println("Готово! Вы сохранили следующий список:")
    for (i in recipeOfBorsch) {
       println("Ингредиент ${recipeOfBorsch.indexOf(i) + 1} $i")
    }
}