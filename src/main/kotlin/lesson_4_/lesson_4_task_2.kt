package lesson_4_

fun main() {
    val cargoWithWeight = 50
    val volumeOfLiters = 100
    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
                "${(cargoWithWeight <= averageWeightFrom) && (cargoWithWeight >= averageVolumeUpTo) && (volumeOfLiters >= averageVolume)}"
    )
}

const val averageWeightFrom = 35
const val averageVolumeUpTo = 100
const val averageVolume = 100