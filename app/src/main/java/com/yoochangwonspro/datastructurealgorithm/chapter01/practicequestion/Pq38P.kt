package com.yoochangwonspro.datastructurealgorithm.chapter01.practicequestion

import java.util.*

fun q12() {
    print("   | ")
    for (i in 1..9) {
        print("$i ")
    }
    println()
    println("---+------------------")

    for (i in 1..9) {
        print(" $i | ")
        for (j in 1..9) {
            print("${i * j} ")
        }
        println()
    }
}

fun q13() {
    print("   | ")
    for (i in 1..9) {
        print("$i ")
    }
    println()
    println("---+------------------")

    for (i in 1..9) {
        print(" $i | ")
        for (j in 1..9) {
            print("${i + j} ")
        }
        println()
    }
}

fun q14() {
    val input = Scanner(System.`in`)
    print("사각형 단 수를 입력해 주세요 : ")
    val num = input.nextInt()

    for (i in 0 until num) {
        for (j in 0 until num) {
            print("*")
        }
        println()
    }
}

fun main(array: Array<String>) {
    q14()
}