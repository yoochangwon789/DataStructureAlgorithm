package com.yoochangwonspro.datastructurealgorithm.chapter01

interface Car {
    fun carName(): String
}

class ZinCar: Car {
    override fun carName(): String {
        return "람보르기니"
    }
}

class TestCar(private val car: Car) {

    operator fun invoke() {
        print(car.carName())
    }
}

fun main(array: Array<String>) {

}