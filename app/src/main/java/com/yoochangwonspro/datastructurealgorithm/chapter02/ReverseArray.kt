package com.yoochangwonspro.datastructurealgorithm.chapter02

import java.util.*

fun swap(a: Array<Int>, first: Int, last: Int) {
    val swap = a[first]
    a[first] = a[last]
    a[last] = swap
}

fun reverse(a: Array<Int>) {
    for (i in 0 until a.size / 2) swap(a, i, a.size - i - 1)
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    print("요솟 수 : ")
    val arraySize = input.nextInt()

    val x = Array<Int>(arraySize) { 0 }

    for (i in x.indices) {
        print("x[$i] = ")
        x[i] = input.nextInt()
    }

    reverse(x)

    println("요소를 역순으로 정렬합니다.")
    for (i in x.indices) println("x[$i] = ${x[i]}")
}
