package org.example.lesson_1

const val CONST_SECONDS_IN_HOUR = 3600
const val CONST_MINUTES_IN_HOUR = 60

fun main() {
    val second = 6480
    val hour = second / CONST_SECONDS_IN_HOUR
    val remainderHour = second % CONST_SECONDS_IN_HOUR
    val minute = remainderHour / CONST_MINUTES_IN_HOUR
    val remainderMinute = remainderHour % CONST_MINUTES_IN_HOUR

    println("${String.format("%02d", hour)}:${String.format("%02d", minute)}:${String.format("%02d", remainderMinute)}")
}

