package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

fun q7() {

    val n = 7
    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    println("q7 : $sum")
}

fun q8() {
    val input = Scanner(System.`in`)
    print("1 부터 n 까지의 합 n 입력 : ")
    val n = input.nextInt()
    val i = 1

    var sum = 0
    sum = (i + n) * n / 2

    println("q8 : $sum")
}

fun q9(a: Int, b: Int) {
    var sum = 0

    for (i in a..b) {
        println(i)
        sum += i
    }

    println("q9 : $sum")
}

fun main(array: Array<String>) {
    q9(3, 8)
}