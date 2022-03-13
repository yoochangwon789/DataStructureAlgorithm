package com.yoochangwonspro.datastructurealgorithm.chapter02

fun main(array: Array<String>) {
    val x = Array(2) { IntArray(4) { 0 } }

    x[0][1] = 37
    x[0][3] = 54
    x[1][2] = 65

    for (i in x.indices) {
        for (j in x[0].indices) {
            println("x[$i][$j] = ${x[i][j]}")
        }
    }
}