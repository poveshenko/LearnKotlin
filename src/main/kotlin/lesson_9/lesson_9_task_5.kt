package lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    repeat(5) {
        print("Введите название ингредиента: ")
        ingredients.add(readln())
    }

    val formattedIngredients = ingredients.sorted().mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar(Char::uppercase) else ingredient
    }

    println(formattedIngredients.joinToString(", ") + ".")
}
