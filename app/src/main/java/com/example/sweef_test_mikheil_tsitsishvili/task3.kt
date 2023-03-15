package com.example.sweef_test_mikheil_tsitsishvili


fun minimalMissingInteger(arr: MutableList<Int>): Int {
    val n = arr.size
    val present = BooleanArray(n + 1)

    for (i in 0 until n) {
        if (arr[i] in 1..n) {
            present[arr[i]] = true
        }
    }

    for (i in 1..n) {
        if (!present[i]) {
            return i
        }
    }

    return n + 1
}

val list = mutableListOf<Int>(1,2,3,4,5,6,54,546,6)

val answerTask3 = minimalMissingInteger(list)

fun main(){
    println(answerTask3)
}
