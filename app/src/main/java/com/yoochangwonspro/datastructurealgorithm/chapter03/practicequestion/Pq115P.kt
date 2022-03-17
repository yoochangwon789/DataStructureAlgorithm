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

fun swqSearchSenForResult() {
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

// 선형 검색 스캐닝 과정 상세 출력 알고리즘
fun q2(x: Array<Int>, n: Int, key: Int): Int {
    print("   |")
    for (i in 0 until n) print("  $i")
    println()

    print("---+")
    for (i in 0 until 4 * n + 2) print("-")
    println()

    for (i in 0 until n) {
        print("   |")
        System.out.printf(String.format("%%%ds*\n", i * 4 + 3), "")
        System.out.printf("%3d|", i)
        for (k in 0 until n) System.out.printf("%4d", x[k])
        println("\n   |")
        if (x[i] == key) return i // 검색성공
    }
    return -1 // 검색실패
}

fun q2Result() {
    val stdIn = Scanner(System.`in`)
    print("요솟수：")
    val num = stdIn.nextInt()
    val x = IntArray(num) // 요솟수 num인 배열
    for (i in 0 until num) {
        print("x[$i]：")
        x[i] = stdIn.nextInt()
    }
    print("찾는 값：") // 키 값을 입력 받음
    val ky = stdIn.nextInt()
    val idx = Test.seqSearchEx(x, num, ky) // 배열 x에서 값이 ky인 요소를 검색
    if (idx == -1) println("그 값의 요소가 없습니다.") else println(ky.toString() + "은 " + "x[" + idx + "]에 있습니다.")
}

fun main(array: Array<String>) {

}