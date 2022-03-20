package com.yoochangwonspro.datastructurealgorithm.chapter03

import kotlin.jvm.JvmStatic
import com.yoochangwonspro.datastructurealgorithm.chapter03.PhysExamSearch.PhyscData
import com.yoochangwonspro.datastructurealgorithm.chapter03.PhysExamSearch.PhyscData.HeightOrderComparator
import java.util.*

internal object PhysExamSearch {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        val x = arrayOf( // 키의 오름차순으로 정렬되어 있습니다.
            PhyscData("이나령", 162, 0.3),
            PhyscData("유지훈", 168, 0.4),
            PhyscData("김한결", 169, 0.8),
            PhyscData("홍준기", 171, 1.5),
            PhyscData("전서현", 173, 0.7),
            PhyscData("이호연", 174, 1.2),
            PhyscData("이수민", 175, 2.0))
        print("몇 cm인 사람을 찾고 있나요?：")
        val height = stdIn.nextInt() // 키 값 입력
        val idx = Arrays.binarySearch(
            x,  // 배열x에서
            PhyscData("", height, 0.0),  // 키가 height인 요소를
            PhyscData.HEIGHT_ORDER // HEIGHT_ORDER에 의해  검색
        )
        if (idx < 0) println("요소가 없습니다.") else {
            println("x[$idx]에 있습니다.")
            println("찾은 데이터：" + x[idx])
        }
    }

    // 신체검사 데이터를 정의합니다.
    internal class PhyscData     // 생성자
        (
// 이름
        private val name: String, // 키
        private val height: Int, // 시력
        private val vision: Double
    ) {
        // 문자열을 반환하는 메서드(정보 확인용)
        override fun toString(): String {
            return "$name $height $vision"
        }

        private class HeightOrderComparator : Comparator<PhyscData> {
            override fun compare(d1: PhyscData, d2: PhyscData): Int {
                return if (d1.height > d2.height) 1 else if (d1.height < d2.height) -1 else 0
            }
        }

        companion object {
            // 오름차순으로 정렬하기 위한 comparator
            val HEIGHT_ORDER: Comparator<PhyscData> = HeightOrderComparator()
        }
    }
}