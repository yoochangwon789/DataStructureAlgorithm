package com.yoochangwonspro.datastructurealgorithm

import java.util.*

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    var num: Int

    do {
        print("왼쪽 아래의 직각삼각형 단 수 : ")
        num = input.nextInt()
    } while (num <=0)

    for (i in 1..num) {
        for (j in 0 until i) {
            print("*")
        }
        println()
    }
}