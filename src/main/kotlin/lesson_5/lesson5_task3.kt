package org.example.lesson_5

const val MAX_NUMBER = 42
const val MIN_NUMBER = 0

fun main() {
    println("Не упустите шанс выиграть по-крупному! Угадайте два числа от 0 до 42.")
    val winNumFirst = 14
    val winNumSecond = 41
    var result = ""

    while (true) {
        println("Введите первое число:")
        val first = readlnOrNull()?.toIntOrNull()

        println("Введите второе число:")
        val second = readlnOrNull()?.toIntOrNull()

        if (first != null && second != null) {
            result = when {
                first !in MIN_NUMBER..MAX_NUMBER || second !in MIN_NUMBER..MAX_NUMBER ->
                    "Введите числа от $MIN_NUMBER до $MAX_NUMBER!\n"

                (first == winNumFirst && second == winNumSecond) || (first == winNumSecond && second == winNumFirst) ->
                    "Поздравляем! Вы выиграли главный приз!\n"

                first == winNumFirst || first == winNumSecond || second == winNumFirst || second == winNumSecond ->
                    "Вы выиграли утешительный приз!\n"

                else -> "Неудача!\n"
            }
        } else println("Вы ввели не числа!")
        println(result)
    }
}