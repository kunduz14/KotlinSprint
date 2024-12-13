package org.example.lesson_2

const val PERCENT = 100

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 20

    val crystalWithBuff = crystal * (PERCENT + buff) / PERCENT
    val ironWithBuff = iron * (PERCENT + buff) / PERCENT

    println("crystals: $crystalWithBuff")
    println("irons: $ironWithBuff")
}