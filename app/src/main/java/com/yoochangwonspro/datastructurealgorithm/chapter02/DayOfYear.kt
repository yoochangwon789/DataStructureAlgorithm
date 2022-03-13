package com.yoochangwonspro.datastructurealgorithm.chapter02

import java.util.*

class DayOfYear {

    companion object {
        private val mDays = arrayOf(
            arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),    // 평년
            arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)     // 윤년
        )

        // 윤년 1, 평년 0,
        // 4 로 나누어 떨어지면 윤년
        // 100 으로 나누어 떨어지고, 4, 400 으로 나누어 떨어지지 않으면 평년
        private fun isLeap(year: Int): Int {
            return if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 1 else 0
        }

        fun dayOfYear(y: Int, m: Int, d: Int): Int {
            var days = d
            for (i in 1 until m) days += mDays[isLeap(y)][i - 1]
            return days
        }

    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    var retry: Int

    println("그 해 경과 일수를 구합니다.")

    do {
        print("년 : ")
        val year = input.nextInt()
        print("월 : ")
        val month = input.nextInt()
        print("일 : ")
        val day = input.nextInt()

        println("그 해 ${DayOfYear.dayOfYear(year, month, day)}일째 입니다.")

        print("한 번 더 할까요? (1.예/0.아니요) : ")
        retry = input.nextInt()
    } while (retry == 1)
}