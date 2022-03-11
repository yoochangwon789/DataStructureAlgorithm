package com.yoochangwonspro.datastructurealgorithm.chapter02.practicequestion

import java.util.*

fun conConvRev() {
    var valueInteger = 0
    val dChar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ"
    var launching = 0
    val result = mutableListOf<Char>()
    val input = Scanner(System.`in`)

    println("10진수를 기수 변환합니다.")

    do {
        print("변환하는 음이 아닌 정수 : ")
        valueInteger = input.nextInt()
    } while (valueInteger <= 0)

    do {
        print("어떤 진수로 변환할까요?(2-36) : ")
        launching = input.nextInt()
    } while (launching < 2 || launching > 36)

    println()
    println("$launching |    $valueInteger")
    println("  +-------")

    do {
        var checkRemain = valueInteger

        result.add(dChar[valueInteger % launching])
        valueInteger /= launching

        if (valueInteger > 0) {
            println("$launching |    $valueInteger   ··· ${dChar[checkRemain % launching]}")
            println("  +-------")
            checkRemain /= launching
        } else {
            println("       $valueInteger   ··· ${dChar[checkRemain % launching]}")
        }
    } while (valueInteger != 0)

    print("$launching 진수로 ")
    for (i in result.size - 1 downTo 0) print("${result[i]} ")
    println("입니다.")
}

fun main(array: Array<String>) {
    conConvRev()
}