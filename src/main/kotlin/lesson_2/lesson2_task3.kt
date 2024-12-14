package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hour = 9
    val minute = 39
    val timeMinute = 457

    val departureMinute = hour * MINUTES_IN_HOUR + minute
    val arrivalHour = (departureMinute + timeMinute) / MINUTES_IN_HOUR
    val arrivalMinute = (departureMinute + timeMinute) % MINUTES_IN_HOUR

    println("$arrivalHour:$arrivalMinute")
}