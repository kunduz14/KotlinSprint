package org.example.lesson_5

fun main() {
    println("Подтвердите, что вы не робот. Сложите два числа.")

    while (true) {
        println("Введите первое число:")
        val first = readlnOrNull()?.toIntOrNull()

        println("Введите второе число:")
        val second = readlnOrNull()?.toIntOrNull()

        println("Введите полученную сумму:")
        val result = readlnOrNull()?.toIntOrNull()

        if (first == null || second == null) println("Введите числа!\n")
        else {
            if (result == sum(first, second)) println("Добро пожаловать!\n")
            else println("Доступ запрещен.\n")
        }
    }
}

fun sum(first: Int, second: Int) = first + second
