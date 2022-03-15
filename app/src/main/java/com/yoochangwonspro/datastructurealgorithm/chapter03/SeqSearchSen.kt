package com.yoochangwonspro.datastructurealgorithm.chapter03

import java.util.*

fun seqSearchSen(a: Array<Int>, num: Int, key: Int): Int {
    var i = 0
    a[num] = key

    while (true) {
        if (a[i] == key) break
        i++
    }

    return if (i == num) -1 else i
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    print("요솟 수 : ")
    val num = input.nextInt()
    val x = Array<Int>(num + 1) { 0 }

    for (i in 0 until num) {
        print("x[$i] : ")
        x[i] = input.nextInt()
    }

    print("검색할 값 : ")
    val key = input.nextInt()

    val searchResult = seqSearchSen(x, num, key)

    if (searchResult == -1) println("그 값의 요소가 없습니다.")
    else println("${key}는 x[$searchResult]에 있습니다.")
}