package com.example.sweef_test_mikheil_tsitsishvili


fun SumOfBin(a: String, b: String): String {
    var x = a.toLongOrNull(2) ?: 0L
    var y = b.toLongOrNull(2) ?: 0L

    while (y != 0L) {
        val carry = x and y
        x = x xor y
        y = carry shl 1
    }

    return x.toString(2)
}


val answerTask4 = SumOfBin("110010","110111001")

fun main(){
    println(answerTask4)
}
