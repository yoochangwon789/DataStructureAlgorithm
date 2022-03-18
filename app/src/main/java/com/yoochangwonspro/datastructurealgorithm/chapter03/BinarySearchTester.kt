package com.yoochangwonspro.datastructurealgorithm.chapter03

import java.util.*

// binarySearch 메서드로 이진검색 알고리즘 구현
fun binarySearchTester() {
    val input = Scanner(System.`in`)

    print("요솟 수 : ")
    val num = input.nextInt()
    val x = Array<Int>(num) { 0 }

    println("오름차순으로 입력하세요.")

    print("x[0] : ")
    x[0] = input.nextInt()

    for (i in 1 until num) {
        do {
            print("x[$i] : ")
            x[i] = input.nextInt()
        } while (x[i] < x[i - 1]) // 바로 앞의 요소보다 작으면 다시 입력
    }

    print("검색할 값 : ")
    val key = input.nextInt()

    val idx = Arrays.binarySearch(x, key)

    if (idx < 0) println("그 값의 요소가 없습니다.")
    else println("${key}은(는) x[$idx]에 있습니다.")
}

fun main(array: Array<String>) {
    binarySearchTester()
}