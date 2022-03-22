package com.yoochangwonspro.datastructurealgorithm.chapter04.practicequestion

import com.yoochangwonspro.datastructurealgorithm.chapter04.IntStackKotlin
import java.util.*

class IntStackX_04_03(capacity: Int) {
    private var max // 스택의 용량 (A・B의 합계)
            : Int
    private var ptrA // 스택 포인터 A
            = 0
    private var ptrB // 스택 포인터 B
            : Int
    private lateinit var stk // 스택 본체
            : IntArray

    enum class AorB {
        StackA, StackB
    }

    // 실행할 때 예외：스택이 비어 있음
    inner class EmptyIntStackX2Exception : RuntimeException()

    // 실행할 때 예외：스택이 가득 참
    inner class OverflowIntStackX2Exception : RuntimeException()

    // 스택에 x를 푸시
    @Throws(OverflowIntStackX2Exception::class)
    fun push(sw: AorB?, x: Int): Int {
        if (ptrA >= ptrB + 1) throw OverflowIntStackX2Exception()
        when (sw) {
            AorB.StackA -> stk[ptrA++] = x
            AorB.StackB -> stk[ptrB--] = x
        }
        return x
    }

    // 스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄)
    @Throws(EmptyIntStackX2Exception::class)
    fun pop(sw: AorB?): Int {
        var x = 0
        when (sw) {
            AorB.StackA -> {
                if (ptrA <= 0) throw EmptyIntStackX2Exception()
                x = stk[--ptrA]
            }
            AorB.StackB -> {
                if (ptrB >= max - 1) throw EmptyIntStackX2Exception()
                x = stk[++ptrB]
            }
        }
        return x
    }

    // 스택에서 데이터를 피크(꼭대기의 데이터를 살펴 봄)
    @Throws(EmptyIntStackX2Exception::class)
    fun peek(sw: AorB?): Int {
        var x = 0
        when (sw) {
            AorB.StackA -> {
                if (ptrA <= 0) throw EmptyIntStackX2Exception()
                x = stk[ptrA - 1]
            }
            AorB.StackB -> {
                if (ptrB >= max - 1) throw EmptyIntStackX2Exception()
                x = stk[ptrB + 1]
            }
        }
        return x
    }

    // 스택에서 x를 검색하여 index(찾지 못하면 -1)를 반환
    fun indexOf(sw: AorB?, x: Int): Int {
        when (sw) {
            AorB.StackA -> {
                var i = ptrA - 1
                while (i >= 0) {
                    // 꼭대기쪽부터 선형 검색
                    if (stk[i] == x) return i // 검색성공
                    i--
                }
            }
            AorB.StackB -> {
                var i = ptrB + 1
                while (i < max) {
                    // 꼭대기쪽부터 선형 검색
                    if (stk[i] == x) return i // 검색성공
                    i++
                }
            }
        }
        return -1 // 검색실패
    }

    // 스택을 비움
    fun clear(sw: AorB?) {
        when (sw) {
            AorB.StackA -> ptrA = 0
            AorB.StackB -> ptrB = max - 1
        }
    }

    // 스택의 용량을 반환 (A와 B의 합계)
    fun capacity(): Int {
        return max
    }

    // 스택에 쌓여있는 데이터 수를 반환
    fun size(sw: AorB?): Int {
        when (sw) {
            AorB.StackA -> return ptrA
            AorB.StackB -> return max - ptrB - 1
        }
        return 0
    }

    // 스택이 비어 있는가?
    fun isEmpty(sw: AorB?): Boolean {
        when (sw) {
            AorB.StackA -> return ptrA <= 0
            AorB.StackB -> return ptrB >= max - 1
        }
        return true
    }

    // 스택이 가득 찼는가?
    val isFull: Boolean
        get() = ptrA >= ptrB + 1

    // 스택 안의 터이터를 바닥 → 꼭대기의 차례로 나타냄
    fun dump(sw: AorB?) {
        when (sw) {
            AorB.StackA -> if (ptrA <= 0) println("스택이 비었습니다.") else {
                var i = 0
                while (i < ptrA) {
                    print(stk[i].toString() + " ")
                    i++
                }
                println()
            }
            AorB.StackB -> if (ptrB >= max - 1) println("스택이 비었습니다.") else {
                var i = max - 1
                while (i > ptrB) {
                    print(stk[i].toString() + " ")
                    i--
                }
                println()
            }
        }
    }

    // 생성자
    init {
        ptrB = capacity - 1
        max = capacity
        try {
            stk = IntArray(max) // 스택 본체용 배열을 생성
        } catch (e: OutOfMemoryError) { // 생성할 수 없습니다.
            max = 0
        }
    }
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    val s = IntStackX_04_03(64)

    while (true) {
        println("현재 데이터 수 : ${s.size(IntStackX_04_03.AorB.StackA)} / ${s.capacity()}")
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
                    s.push(IntStackX_04_03.AorB.StackA, x)
                } catch (e : IntStackKotlin.OverflowIntStackException) {
                    println("스택이 가득 찼습니다.")
                }
            }
            2 -> {
                // 팝
                try {
                    x = s.pop(IntStackX_04_03.AorB.StackA)
                    print("팝한 데이터는 $x 입니다.")
                } catch (e: IntStackKotlin.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
            }
            3 -> try {
                x = s.peek(IntStackX_04_03.AorB.StackA)
                println("피크한 데이터는 $x 입니다.")
            } catch (e: IntStackKotlin.EmptyIntStackException) {
                println("스택이 비어 있습니다.")
            }
            4 -> s.dump(IntStackX_04_03.AorB.StackA)

            5 -> {
                try {
                    print("찾을 데이터 : ")
                    x = input.nextInt()
                    s.indexOf(IntStackX_04_03.AorB.StackA, x)
                } catch (e: IntStackKotlin.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
            }
            6 -> {
                if (s.isEmpty(IntStackX_04_03.AorB.StackA)) println("스택이 비어 있습니다.")
                else println("스택이 비어있지 않습니다.")
            }
            7 -> {
                if (s.isFull) println("스택이 가득 차 입니다.")
                else println("스택이 가득차있지 않습니다.")
            }
        }
    }
}

