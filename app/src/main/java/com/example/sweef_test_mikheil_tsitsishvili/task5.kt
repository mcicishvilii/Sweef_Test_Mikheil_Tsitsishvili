package com.example.sweef_test_mikheil_tsitsishvili

fun countVariants(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    val ways = IntArray(n + 1)
    ways[0] = 1
    ways[1] = 1
    for (i in 2..n) {
        ways[i] = ways[i - 1] + ways[i - 2]
    }
    return ways[n]
}

val answerTask5 = countVariants(countVariants(4))

fun main(){
    println(answerTask5)
}
