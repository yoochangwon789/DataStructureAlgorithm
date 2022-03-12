package com.yoochangwonspro.datastructurealgorithm.chapter02

fun main(array: Array<String>) {
    var count = 0
    var primeCnt = 0
    val prime = Array<Int>(500) { 0 }

    prime[primeCnt++] = 2

    for (n in 3..1000 step(2)) {
        var i = 1
        while (i < primeCnt) {
            count++
            if (n % prime[i] == 0) break
            i++
        }
        if (i == primeCnt) {
            prime[primeCnt++] = n
        }
    }

    for (i in prime.indices) println(prime[i])

    println("나눗셈을 수행한 횟수 : $count")
}