package org.example.lesson_5

fun main() {
    println("Привет! Я могу рассчитать стоимость топлива для поездки.")
    println("Введите растояне поездки (в километрах):")
    val distance = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах):")
    val consumeFuel = readln().toDouble()
    println("Введите текущую цену за литр топлива:")
    val currentPrice = readln().toDouble()

    val fuel = (distance * consumeFuel) / 100
    val price = fuel * currentPrice

    println("Топливо: $fuel литров")
    println("Цена: ${String.format("%.2f", price)}")
}