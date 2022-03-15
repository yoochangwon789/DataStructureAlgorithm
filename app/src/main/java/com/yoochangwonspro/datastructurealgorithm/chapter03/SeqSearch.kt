package com.yoochangwonspro.datastructurealgorithm.chapter03

import java.util.*

fun seqSearch(a: Array<Int>, n: Int, key: Int): Int {
    var i = 0

    while (true) {
        if (i == n) return -1
        if (a[i] == key) return i
        i++
    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    print("요솟 수 : ")
    val num = input.nextInt()
    val x = Array<Int>(num) { 0 }

    x.forEachIndexed { index, _ ->
        print("x[$index] : ")
        x[index] = input.nextInt()
    }

    print("검색할 값 : ")
    val key = input.nextInt()

    val searchResult = seqSearch(x, num, key)

    if (searchResult == -1) println("그 값의 요소가 없습니다.")
    else println("${key}는 x[$searchResult]에 있습니다.")
}