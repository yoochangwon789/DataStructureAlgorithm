package com.yoochangwonspro.datastructurealgorithm.chapter02.practicequestion

import java.util.*

// 사람수와 키를 랜덤으로 받아서 사람의 키 최댓값 구하는 알고리즘
fun randomHeightHuman() {
    val humanNumRandom = (1..10)
    val humanHeightRandom = (100..200)

    val valueHumanNumRandom = humanNumRandom.random()
    println("사람수 : $valueHumanNumRandom")

    val humans = Array<Int>(valueHumanNumRandom) { 0 }
    for (i in humans.indices) {
        val valueHumanHeightRandom = humanHeightRandom.random()
        println("height[$i] : $valueHumanHeightRandom")
        humans[i] = valueHumanHeightRandom
    }

    println("사람들 중에서 가장 큰 키의 최대값은 ${humansHeightMax(humans)} 입니다.")
}

fun humansHeightMax(humans: Array<Int>): Int {
    var max = humans[0]

    for (i in humans.indices) {
        if (humans[i] > max) max = humans[i]
    }

    return max
}

fun main(array: Array<String>) {
    randomHeightHuman()
}