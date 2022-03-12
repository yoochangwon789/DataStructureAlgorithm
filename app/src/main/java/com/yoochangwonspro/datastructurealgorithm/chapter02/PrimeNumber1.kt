package com.yoochangwonspro.datastructurealgorithm.chapter02

fun main(args: Array<String>) {
//    var count = 0
//    for (n in 2..50) {
//        var i = 2
//        while (i < n) {
//            count++
//            if (n % i == 0) break
//            i++
//        }
//        if (n == i) {
//            println(n)
//        }
//    }
//    println("나숫셈을 수행한 횟수 : $count")

    primeNumberPractice()
}

fun primeNumberPractice() {
    var count = 0
    var primeCnt = 0
    val prime = Array<Int>(50) { 0 }

    prime[primeCnt++] = 2

    for (n in 3..30 step(2)) {
        var i = 1
        while (i < primeCnt) {
            count++
            if (n % prime[i] == 0) break
            i++
        }
        if (i == primeCnt) prime[primeCnt++] = n
    }

    for (i in prime.indices) println(prime[i])
    println("나눈 수 : $count")
}