package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

// 숫자 3개를 입력 받고 최댓값 구하기
fun main(array: Array<String>) {

    print("최댓값 : ${max3(5,2,4)}")
}

fun max3(a: Int, b: Int, c: Int): Int {
    var max = a

    if (b > max) max = b
    if (c > max) max = c

    return max
}