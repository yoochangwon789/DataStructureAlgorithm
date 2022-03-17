package com.yoochangwonspro.datastructurealgorithm.chapter03.practicequestion

import java.util.*

// 보초법 for 문으로 구현
fun swqSearchSenFor(x: Array<Int>, num: Int, key: Int): Int {
    x[num] = key
    var result = -1

    for(i in 0 until num)
        if (x[i] == key) result = i

    return result
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

    val result = swqSearchSenFor(x, num, key)
    if (result == -1) println("${key}은(는) 없습니다.")
    else println("${key}은(는) x[$result]에 있습니다.")
}