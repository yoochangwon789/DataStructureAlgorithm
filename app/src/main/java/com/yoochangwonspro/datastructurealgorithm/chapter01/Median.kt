package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

fun median(a: Int, b: Int, c: Int): Int {
    if (a >= b)
        if (b >= c)
            return b
        else if (a <= c)
            return a
        else
            return c
    else if (a > c)
        return a
    else if (b > c)
        return c
    else
        return b
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    println("세 정수의 중앙값을 구합니다.")
    print("정수 a : ")
    val a = input.nextInt()
    print("정수 b : ")
    val b = input.nextInt()
    print("정수 c : ")
    val c = input.nextInt()
    println("세 정수의 중앙 값은 ${median(a, b, c)} 입니다.")
}