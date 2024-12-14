package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60

fun main() {
    val second = 6480
    val hour = second / SECONDS_IN_HOUR
    val remainderHour = second % SECONDS_IN_HOUR
    val minute = remainderHour / MINUTES_IN_HOUR
    val remainderMinute = remainderHour % MINUTES_IN_HOUR

    println("%02d:%02d:%02d".format(hour, minute, remainderMinute))
}

