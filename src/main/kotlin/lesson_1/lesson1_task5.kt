package org.example.lesson_1

fun main() {
    val second = 6480
    val hour = second / 3600
    val remainderHour = second % 3600
    val minute = remainderHour / 60
    val remainderMinute = remainderHour % 60

    println("0$hour:$minute:0$remainderMinute")
}