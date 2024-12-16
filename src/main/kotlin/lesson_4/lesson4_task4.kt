package org.example.lesson_4

fun main() {
    val day = 5
    val exercisesForHands: Boolean
    val exercisesForPress: Boolean
    val exercisesForLegs: Boolean
    val exercisesForBacks: Boolean

    if (day % 2 != 0) {
        exercisesForHands = true
        exercisesForPress = true
        exercisesForLegs = false
        exercisesForBacks = false
    } else {
        exercisesForHands = false
        exercisesForPress = false
        exercisesForLegs = true
        exercisesForBacks = true
    }

    println("""
        Упражнения для рук:       $exercisesForHands
        Упражнения для ног:       $exercisesForLegs
        Упражнения для спины:  $exercisesForBacks
        Упражнения для пресса: $exercisesForPress
    """.trimIndent())
}