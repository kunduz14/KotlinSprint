package org.example.lesson_4

fun main() {
    val day = 5
    val isEvenDay = day % 2 == 0

    if (isEvenDay == true) {
        println("""
            Упражнения для рук:    false
            Упражнения для ног:    true
            Упражнения для спины:  true
            Упражнения для пресса: false
        """.trimIndent()
        )
    } else {
        println("""
            Упражнения для рук:    true
            Упражнения для ног:    false
            Упражнения для спины:  false
            Упражнения для пресса: true
        """.trimIndent()
        )
    }
}