package lesson_8

fun main() {
    val recipeOfBorsch = arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Чеснок", "Говядина", "Соль")

    println("Список ингредиентов:")
    for (ingredient in recipeOfBorsch) {
        println("Ингредиент ${recipeOfBorsch.indexOf(ingredient) + 1} $ingredient")
    }

    println("Введите ингредиент, который вы хотите заменить:")
    val findIngredient = readln()
    if (findIngredient !in recipeOfBorsch) {
        println("Ингредиента \"$findIngredient\"} нет в списке.")
    } else {
        println("Введите замену для ингредиента $findIngredient:")
        val newIngredient = readln()

        // Заменяем ингредиент
        for (index in recipeOfBorsch.indices) {
            if (recipeOfBorsch[index] == findIngredient) {
                recipeOfBorsch[index] = newIngredient
            }
        }
        println("Готово! Вы сохранили следующий список: ")
        for (ingredient in recipeOfBorsch) {
            println("Ингредиент ${recipeOfBorsch.indexOf(ingredient) + 1} $ingredient")
        }
    }
}