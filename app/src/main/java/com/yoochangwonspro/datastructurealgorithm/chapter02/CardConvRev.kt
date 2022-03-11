package com.yoochangwonspro.datastructurealgorithm.chapter02

import java.util.*

fun cardConvRev(x: Int, r: Int, d: MutableList<Char> = mutableListOf()) {
    var digits = 0
    val dChar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ"
    var x2 = x

    do {
        d.add(dChar[x2 % r])
        digits++
        x2 /= r
    } while (x2 != 0)

    for (i in d.size - 1 downTo 0) {
        print("${d[i]} ")
    }
}

fun cardConvRev2() {
    val input = Scanner(System.`in`)
    var no = 0      // 변환하는 정수
    var cd = 0      // 기수
    var dno = 0     // 변환 후의 자릿수
    var retry = 0   // 다시 한번?
    val cno = mutableListOf<Char>()
    val dChar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ"

    println("10진수를 기수 변환합니다.")
    do {
        do {
            print("변환하는 음이 아닌 정수 : ")
            no = input.nextInt()
        } while (no < 0)

        do {
            print("어떤 진수로 변환할까요? (2~36) : ")
            cd = input.nextInt()
        } while (cd < 2 || cd > 36)

        print("$cd 진수로는 ")
        do {
            cno.add(dChar[no % cd])
            no /= cd
        } while (no != 0)
        for (i in cno.size - 1 downTo 0) print("${cno[i]} ")
        println("입니다.")

        print("한 번 더 할까요? (1.예/0.아니오) : ")
        retry = input.nextInt()
    } while (retry == 1)
}

fun main(array: Array<String>) {
//    cardConvRev(59, 2)
    cardConvRev2()
}