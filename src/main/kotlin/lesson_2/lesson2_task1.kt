package org.example.lesson_2

fun main() {
    val evaluations = intArrayOf(3, 4, 3, 5)
    var sum = 0

    for (i in evaluations) {
        sum += i
    }
    val average = sum.toDouble() / evaluations.size

    println(average)
}