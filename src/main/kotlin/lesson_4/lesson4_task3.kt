package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val AIR_HUMIDITY = 20
const val SEASON = "Not winter"

fun main() {
    val weatherTodayIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val currentSeason = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherTodayIsSunny == SUNNY_WEATHER && awningIsOpen == OPEN_AWNING 
                    && airHumidity == AIR_HUMIDITY && currentSeason == SEASON}")
}
