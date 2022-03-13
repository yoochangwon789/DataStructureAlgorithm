package com.yoochangwonspro.datastructurealgorithm.chapter02.practicequestion

import java.util.*

class PhysicalExamination {

    data class PhysicalData(val name: String, val height:Int, val vision: Double)

    companion object {
        const val VMAX = 21

        // 키으 평균 값을 구하는 함수
        fun aveHeight(dat: Array<PhysicalData>): Double {
            var sum: Double = 0.0
            dat.forEach { physicalData -> sum += physicalData.height.toDouble() }
            return sum / dat.size
        }

        // 시력 분포를 구함
        fun distVision(dat: Array<PhysicalData>, dist: IntArray) {
            dist[0] = 0
            for (i in dat.indices)
                if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                    dist[(dat[i].vision * 10).toInt()]++
        }

        fun distVisionString(dat: Array<PhysicalData>, dist: Array<String>) {
            dist[0] = ""
            val star = "*"
            for (i in dat.indices)
                if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                    dist[(dat[i].vision * 10).toInt()] += star
        }
    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    val physicalDataList = arrayOf(
        PhysicalExamination.PhysicalData("박현규", 162, 0.3),
        PhysicalExamination.PhysicalData("함진아", 173, 0.3),
        PhysicalExamination.PhysicalData("최윤미", 175, 2.0),
        PhysicalExamination.PhysicalData("홍연의", 171, 1.5),
        PhysicalExamination.PhysicalData("이수진", 168, 0.4),
        PhysicalExamination.PhysicalData("김영준", 174, 1.2),
        PhysicalExamination.PhysicalData("박용규", 169, 0.8),
    )

    println("평균 키 : ${PhysicalExamination.aveHeight(physicalDataList)}")

    println("시력 분포")
    val distResult = IntArray(PhysicalExamination.VMAX)
    val distResultString = Array<String>(PhysicalExamination.VMAX) { "" }

    PhysicalExamination.distVision(physicalDataList, distResult)
    PhysicalExamination.distVisionString(physicalDataList, distResultString)

    for (i in distResultString.indices) println("${i / 10.0} ~ : ${distResultString[i]}")
}