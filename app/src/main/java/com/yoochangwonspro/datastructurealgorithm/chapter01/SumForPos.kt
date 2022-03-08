package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

// 음수 값은 받지 않고 0보다 큰 양수를 받아서 1 ~ n 까지의 합 구하기
fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    var n: Int
    println("1부터 n 까지의 합을 구합니다.")

    // n 이 0 보타 크지 않으면 반복 루프
    do {
        print("n 의 값 : ")
        n = input.nextInt()
        if (n <= 0) println("n 은 0보다 큰 양수만 입력해주세요.")
    } while (n <= 0)

    var sum = 0

    for (i in 1..n) sum += i
    println("sum : $sum")
}