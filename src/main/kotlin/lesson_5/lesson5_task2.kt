package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите год рождения:")
    val birthYear = readlnOrNull()?.toIntOrNull()
    val currentYear = LocalDate.now().year

    if (birthYear != null) {
        val resultText = if (currentYear - birthYear > AGE_OF_MAJORITY) {
            "Показать экран со скрытым контентом\n"
        } else {
            "Вернуться на главный экран\n"
        }
        println(resultText)
    } else println("Год рожденя введён не корректно!\n")
}