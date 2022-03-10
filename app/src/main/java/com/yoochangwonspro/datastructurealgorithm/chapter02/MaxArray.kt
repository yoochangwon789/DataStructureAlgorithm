package com.yoochangwonspro.datastructurealgorithm.chapter02

import java.util.*

fun maxOfArray(humans: Array<Int>): Int {
    var max = humans[0]

    for (i in humans.indices) {
        if (humans[i] > max) max = humans[i]
    }

    return max
}

fun inputArray() {
    println("키의 최댓값을 구합니다.")
    val input = Scanner(System.`in`)
    print("사람수 : ")
    val humanCnt = input.nextInt()

    val humans = Array<Int>(humanCnt) { 0 }
    for (i in humans.indices) {
        print("height[$i] : ")
        val detailHuman = input.nextInt()
        humans[i] = detailHuman
    }

    println("최댓값은 ${maxOfArray(humans)} 입니다.")
}

fun maxOfArrayRand() {
    println("키의 최댓값을 구합니다.")
    val input = Scanner(System.`in`)
    print("사람수 : ")
    val humanCnt = input.nextInt()

    val humanHeightRandom = (10..99)

    val humans = Array<Int>(humanCnt) { 0 }
    for (i in humans.indices) {
        val random = humanHeightRandom.random()
        println("height[$i] : ${100 + random}")
        humans[i] = random + 100
    }

    println("최댓값은 ${maxOfArray(humans)} 입니다.")
}

fun main(array: Array<String>) {
//    inputArray()
    maxOfArrayRand()
}


