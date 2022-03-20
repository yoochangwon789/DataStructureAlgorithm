package com.yoochangwonspro.datastructurealgorithm.chapter03.practicequestion

import com.yoochangwonspro.datastructurealgorithm.chapter03.PhysExamSearch
import java.util.*

// 시력에 대한 내림차순 정렬 이진 검색
class Pq129P(
    private val name: String,
    private val height: Int,
    private val vision: Double
) {
    override fun toString(): String {
        return "$name $height $vision"
    }

    class HeightOrderComparator: Comparator<Pq129P> {
        override fun compare(o1: Pq129P, o2: Pq129P): Int {
            return if (o1.vision > o2.vision) 1 else if (o1.vision < o2.vision) -1 else 0
        }
    }

    companion object {
        val VISION_ORDER = HeightOrderComparator()
    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    val x = arrayOf(
        Pq129P("이나령", 162, 0.3),
        Pq129P("유지훈", 168, 0.4),
        Pq129P("김한결", 169, 0.8),
        Pq129P("홍준기", 171, 1.5),
        Pq129P("전서현", 173, 0.7),
        Pq129P("이호연", 174, 1.2),
        Pq129P("이수민", 175, 2.0)
    )

    print("찾는 시력은 : ")
    val vision = input.nextDouble()
    val idx = Arrays.binarySearch(x, Pq129P("", 0, vision), Pq129P.VISION_ORDER)

    if (idx < 0)
        println("그 값의 요소가 없습니다.")
    else {
        println("그 값은 x[$idx]에 있습니다.")
        println("데이터 : ${x[idx]}")
    }
}