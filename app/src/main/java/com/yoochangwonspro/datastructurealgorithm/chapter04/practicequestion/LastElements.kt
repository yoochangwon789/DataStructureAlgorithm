package com.yoochangwonspro.datastructurealgorithm.chapter04.practicequestion

import java.util.*
import kotlin.jvm.JvmStatic

// 원하는 개수만큼 값을 입력 받아 요솟수 N인 배열에 마지막 N개를 저장
internal object LastNElements {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        val N = 10
        val a = IntArray(N) // 입력 받은 값을 저장
        var cnt = 0 // 입력 받은 개수
        var retry: Int // 다시 한 번?
        println("정수를 입력하세요.")
        do {
            System.out.printf("%d번째 정수：", cnt + 1)
            a[cnt++ % N] = stdIn.nextInt()
            print("계속 할까요? (예.1／아니오.0）：")
            retry = stdIn.nextInt()
        } while (retry == 1)
        var i = cnt - N
        if (i < 0) i = 0
        while (i < cnt) {
            System.out.printf("%2d번째의 정수 ＝ %d\n", i + 1, a[i % N])
            i++
        }
    }
}