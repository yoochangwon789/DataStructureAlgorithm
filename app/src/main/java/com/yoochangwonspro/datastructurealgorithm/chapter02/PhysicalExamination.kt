package com.yoochangwonspro.datastructurealgorithm.chapter02

class PhysicalExamination {

    data class PhysicalData(val name: String, val height:Int, val vision: Double)

    companion object {
        const val VMAX = 21

        // 키으 평균 값을 구하는 함수
        fun aveHeight(dat: ArrayList<PhysicalData>): Double {
            var sum: Double = 0.0
            dat.forEach { physicalData -> sum += physicalData.height }
            return sum / dat.size
        }

        // 시력 분포를 구함
        fun distVision(dat: ArrayList<PhysicalData>, dist: Array<Int>) {

        }
    }
}

fun main(array: Array<String>) {

}