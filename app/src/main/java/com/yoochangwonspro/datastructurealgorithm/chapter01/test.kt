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

abstract class Test() {
    lateinit var name: String
    abstract fun getNameTest(): String

    fun create() {
        name = getNameTest()
        println(name)
    }

    open fun testCreate() {
        println("테스트 Create")
    }
}

class Test2: Test() {
    override fun getNameTest(): String = "유창원"

    override fun testCreate() {
        super.testCreate()
        println("테스트2 Create")
    }
}

fun main(array: Array<String>) {

    val test = Test2()
    test.create()
    test.testCreate()
}