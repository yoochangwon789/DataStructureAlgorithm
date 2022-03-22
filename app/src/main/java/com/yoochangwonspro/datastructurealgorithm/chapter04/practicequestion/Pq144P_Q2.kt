package com.yoochangwonspro.datastructurealgorithm.chapter04.practicequestion

import com.yoochangwonspro.datastructurealgorithm.chapter04.IntStackKotlin
import java.lang.RuntimeException
import java.util.*

class IntStackKotlinGeneric<T>(
    // 스택 용량
    private var max: Int
) {
    private var ptr = 0

    private lateinit var stk: Array<T>


    // 실행 시 예외 : 스택이 비어 있음
    class EmptyIntStackException : RuntimeException()

    // 실행 시 예외 : 스택이 가득 참
    class OverflowIntStackException : RuntimeException()

    // 스택에 x를 푸시
    @Throws(OverflowIntStackException::class)
    fun push(x: T): T {
        if (ptr >= max) throw OverflowIntStackException()
        return x.also { stk[ptr++] = it }
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    @Throws(EmptyIntStackException::class)
    fun pop(): T {
        if (ptr <= 0) throw EmptyIntStackException()
        return stk[--ptr]
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    @Throws(EmptyIntStackException::class)
    fun peek(): T {
        if (ptr <= 0) throw EmptyIntStackException()
        return stk[ptr - 1]
    }

    // 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
    fun indexOf(x: Int): Int {
        for (i in ptr - 1 downTo 0)  // 정상 쪽에서 선형 검색
            if (stk[i] == x) return i // 검색 성공
        return -1 // 검색 실패
    }

    // 스택을 비움
    fun clear() {
        ptr = 0
    }

    // 스택의 용량을 반환
    fun capacity(): Int {
        return max
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    fun size(): Int {
        return ptr
    }

    // 스택이 비어 있는가?
    val isEmpty: Boolean
        get() = ptr <= 0

    // 스택이 가득 찼는가?
    val isFull: Boolean
        get() = ptr >= max

    // 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
    fun dump() {
        if (ptr <= 0) println("스택이 비어 있습니다.") else {
            for (i in 0 until ptr) print(stk[i].toString() + " ")
            println()
        }
    }

    // 생성자
    init {
        try {
            stk = arrayOf<Any>(max) as Array<T> // 스택 본체용 배열을  생성
        } catch (e: OutOfMemoryError) {        // 생성할 수 없음
            max = 0
        }
    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    val s = IntStackKotlinGeneric<Int>(64)

    while (true) {
        println("현재 데이터 수 : ${s.size()} / ${s.capacity()}")
        print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)IndexOf " +
                "(6)스택이 비어있는지 확인 (7)스택이 가득차있는지 확인 (0)종료 : ")
        val menu = input.nextInt()

        if (menu == 0) break

        var x: Any
        when (menu) {
            1 -> {
                // 푸쉬
                print("데이터 : ")
                x = input.nextInt()
                try {
                    s.push(x)
                } catch (e : IntStackKotlin.OverflowIntStackException) {
                    println("스택이 가득 찼습니다.")
                }
            }
            2 -> {
                // 팝
                try {
                    x = s.pop()
                    print("팝한 데이터는 $x 입니다.")
                } catch (e: IntStackKotlin.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
            }
            3 -> try {
                x = s.peek()
                println("피크한 데이터는 $x 입니다.")
            } catch (e: IntStackKotlin.EmptyIntStackException) {
                println("스택이 비어 있습니다.")
            }
            4 -> s.dump()

            5 -> {
                try {
                    print("찾을 데이터 : ")
                    x = input.nextInt()
                    s.indexOf(x)
                } catch (e: IntStackKotlin.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
            }
            6 -> {
                if (s.isEmpty) println("스택이 비어 있습니다.")
                else println("스택이 비어있지 않습니다.")
            }
            7 -> {
                if (s.isFull) println("스택이 가득 차 입니다.")
                else println("스택이 가득차있지 않습니다.")
            }
        }
    }
}