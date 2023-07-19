package lesson_2
import kotlin.math.pow

fun main() {
    val clientInvested = 70_000
    val interestRate = 16.7
    val result = clientInvested * ((1 + (interestRate / 100)).pow(20))
    println(String.format("%.3f", result))
}

