package org.example.lesson_4

const val CHAIRS = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = if (bookedToday < CHAIRS) true else false
    val availableTomorrow = if (bookedTomorrow < CHAIRS) true else false

    println("Доступность столиков на сегодня: $availableToday\n" +
            "Доступность столиков на сегодня: $availableTomorrow")
}