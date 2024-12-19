package org.example.lesson_5

import kotlin.math.pow

const val CENTIMETERS_IN_METERS = 100
const val MIN_IBM = 18.5
const val AVERAGE_IBM = 25.0
const val MAX_IBM = 30.0

fun main() {
    println("Привет! Здесь вы можете расчитать свой ИМТ.")
    println("Введите вес в килограммах:")
    val userWeight = readln().toDouble()
    println("Введите рост в сантиметрах:")
    val userHeight = readln().toDouble()

    val userHeightInMeters = userHeight / CENTIMETERS_IN_METERS
    val indexBodyMass = userWeight / userHeightInMeters.pow(2)

    val category = when (indexBodyMass) {
        in 0.0..MIN_IBM -> "Недостаточная масса тела"
        in MIN_IBM..AVERAGE_IBM -> "Нормальная масса тела"
        in AVERAGE_IBM..<MAX_IBM -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("ИМТ = ${String.format("%.2f", indexBodyMass)}: $category")
}