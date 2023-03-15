package com.example.sweef_test_mikheil_tsitsishvili


val numbers = listOf(1,2,452,234,234,53524,534,53,5234)

fun findNonRepeatedNumber(numbers: List<Int>): Int {
    var result = 0
    for (number in numbers) {
        result = result xor number // ertmanets adris bitebs
        // magalitad tu vadrit 10 da 15s, 10s dashli
    }
    return result
}


val answer = findNonRepeatedNumber(numbers)

fun main(){
    println(answer)
}
