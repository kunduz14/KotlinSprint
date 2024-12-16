package org.example.lesson_4

const val WEIGHT_AVERAGE = 35
const val VOLUME_AVERAGE = 100

fun main() {
    val weight1 = 20
    val weight2 = 50
    val volume1 = 50
    val volume2 = 100

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории \"Average\": ${weight1 > WEIGHT_AVERAGE && volume1 <= VOLUME_AVERAGE}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории \"Average\": ${weight2 > WEIGHT_AVERAGE && volume2 <= VOLUME_AVERAGE}")
}