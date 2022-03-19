package com.yoochangwonspro.datastructurealgorithm.chapter03

internal class Id {
    // 아이디를 반환하는 인스턴트 메서드
    // 아이디
    val id: Int

    companion object {
        private var counter = 0 // 아이디를 몇 개 부여했는지 저장

        // counter를 반환하는 클래스 메서드
        fun getCounter(): Int {
            return Companion.counter
        }
    }

    // 생성자
    init {
        id = ++Companion.counter
    }
}

object IdTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = Id() // 아이디 1
        val b = Id() // 아이디 2
        println("a의 아이디：" + a.id)
        println("b의 아이디：" + b.id)
        println("부여한 아이디의 개수 : " + Id.Companion.getCounter())
    }
}