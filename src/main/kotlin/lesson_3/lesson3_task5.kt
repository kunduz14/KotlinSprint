package org.example.lesson_3

fun main() {
    val send = "D2-D4;0"
    val whereFrom = send.slice(0..1)
    val where = send.subSequence(3,5)
    val moveNumber = send.drop(6)

    println(whereFrom)
    println(where)
    println(moveNumber)
}