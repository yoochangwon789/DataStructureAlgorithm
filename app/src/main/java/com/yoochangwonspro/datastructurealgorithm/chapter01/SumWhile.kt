package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    println("1부터 n 까지의 합을 구합니다.")
    val n = input.nextInt()

    var i = 1
    var sum = 0

    while (i <= n) {
        sum += i
        i++
    }

    println("i -> $i")
    println("sum -> $sum")
}