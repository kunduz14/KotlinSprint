package org.example.lesson_3

fun main() {
    val send = "D2-D4;0"
    val whereFrom = send.split('-', ';') [0]
    val where = send.split('-', ';') [1]
    val moveNumber = send.split('-', ';') [2]

    println(whereFrom)
    println(where)
    println(moveNumber)
}