package org.example.lesson_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var moveNumber = 1

    var sendingToServer = "$whereFrom - $where; $moveNumber"
    println(sendingToServer)

    whereFrom = "D2"
    where = "D3"
    moveNumber += 1

    sendingToServer = "$whereFrom - $where; $moveNumber"
    println(sendingToServer)
}