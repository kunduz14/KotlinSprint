package org.example.lesson_3

fun main() {
    val send = "D2-D4;0"
    val sendToList = send.split('-', ';')
    val whereFrom = sendToList[0]
    val where = sendToList[1]
    val moveNumber = sendToList[2]

    println(whereFrom)
    println(where)
    println(moveNumber)
}