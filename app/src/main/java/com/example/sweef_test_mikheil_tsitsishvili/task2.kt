package com.example.sweef_test_mikheil_tsitsishvili


fun calculateMinimalCoinsNeeded(amount: Int): String {
    val coins = listOf(50, 20, 10, 5, 1)
    var remainingAmount = amount
    val result = mutableMapOf<Int, Int>()

    var i = 0
    while (remainingAmount > 0 && i < coins.size) {
        val coin = coins[i]
        val numCoins = remainingAmount / coin
        if (numCoins > 0) {
            result[coin] = numCoins
            remainingAmount %= coin
        }
        i++
    }

    val coinsList = result.values
    val answer = coinsList.sum()
    return answer.toString()
}


val answerTask2 = calculateMinimalCoinsNeeded(11)

fun main(){
    println(answerTask2)
}
