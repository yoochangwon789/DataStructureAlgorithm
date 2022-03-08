package com.yoochangwonspro.datastructurealgorithm.chapter01.practicequestion

import java.util.*

fun q10() {
    val input = Scanner(System.`in`)
    print("a 값 입력 : ")
    val a = input.nextInt()
    var b: Int

    do {
        print("b 값 입력 : ")
        b = input.nextInt()
        if (b <= a) println("a 보다 큰 값을 입력해 주세요.")
    } while (b <= a)

    var result = 0
    result = b - a

    println("result : $result")
}

fun q11() {
    val input = Scanner(System.`in`)
    var n: Int

    do {
        print("양의 정수를 입력해 주세요 : ")
        n = input.nextInt()
    } while (n <= 0)

    var result = 0

    while (n > 0) {
        n /= 10
        result++
    }

    println("result : $result")
}

fun main(array: Array<String>) {
    q11()
}