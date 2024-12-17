package org.example.lesson_5

fun main() {
    val winList = mutableListOf((0..42).random(), (0..42).random(), (0..42).random())

    println("Не упустите шанс выиграть по-крупному! Угадайте три числа от 0 до 42.")

    while (true) {
        println("Введите первое число:")
        val first = readln().toInt()

        println("Введите второе число:")
        val second = readln().toInt()

        println("Введите третье число:")
        val third = readln().toInt()

        val userList = mutableListOf(first, second, third)
        val numberMatch = winList.intersect(userList.toSet()).size

        val result = when (userList.size - numberMatch) {
            0 -> "Поздравляем! Вы выиграли главный приз!"
            1 -> "Поздравляем! Вы угадали два числа и получаете крупный приз"
            2 -> "Вы выиграли утешительный приз!"
            else -> "Неудача!"
        }
        println(result)
        println("$winList\n")
    }
}