package com.yoochangwonspro.datastructurealgorithm.chapter03.practicequestion

import android.annotation.SuppressLint
import java.util.*
import kotlin.jvm.JvmStatic

object Test {
    @SuppressLint("DefaultLocale")
    fun seqSearchEx(a: IntArray, n: Int, key: Int): Int {
        print("   |")
        for (k in 0 until n) System.out.printf("%4d", k)
        println()
        print("---+")
        for (k in 0 until 4 * n + 2) print("-")
        println()
        for (i in 0 until n) {
            print("   |")
            System.out.printf(String.format("%%%ds*\n", i * 4 + 3), "")
            System.out.printf("%3d|", i)
            for (k in 0 until n) System.out.printf("%4d", a[k])
            println("\n   |")
            if (a[i] == key) return i // 검색성공
        }
        return -1 // 검색실패
    }

    @JvmStatic
    fun main(args: Array<String>) {
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
        val idx = seqSearchEx(x, num, ky) // 배열 x에서 값이 ky인 요소를 검색
        if (idx == -1) println("그 값의 요소가 없습니다.") else println(ky.toString() + "은 " + "x[" + idx + "]에 있습니다.")
    }
}