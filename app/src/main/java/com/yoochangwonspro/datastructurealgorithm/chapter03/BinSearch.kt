package com.yoochangwonspro.datastructurealgorithm.chapter03

import java.util.*

fun binSearch(a: Array<Int>, num: Int, key: Int): Int {
    var pickFirst = 0
    var pickLast = num - 1

    do {
        val pickCenter = (pickFirst + pickLast) / 2

        when {
            a[pickCenter] == key -> return pickCenter
            a[pickCenter] < key -> pickFirst = pickCenter + 1
            else -> pickLast = pickCenter - 1
        }
    } while (pickFirst <= pickLast)

    return  -1
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    var num = 0
    var key = 0

    print("요솟 수 : ")
    num = input.nextInt()
    println("오름차순으로 입력하세요.")

    val a = Array<Int>(num) { 0 }
    print("a[0] : ")
    a[0] = input.nextInt()

    for (i in 1 until num) {
        do {
            print("a[$i] : ")
            a[i] = input.nextInt()
        } while (a[i] < a[i - 1])
    }

    print("검색할 값 : ")
    key = input.nextInt()

    val checkResult = binSearch(a, num, key)

    if (checkResult == -1) println("검색한 값이 배열에 없습니다.")
    else println("${key}은(는) x[$checkResult]에 있습니다.")
}