package adventofcode.year2020.day8

import adventofcode.FileReader
import org.junit.Test

class Day8Test {

    @Test
    fun testDay8Task1() {
        val input = FileReader.getResource("year2020/day8.txt")
        println("2020 Day 8 Task 1: ${Task1.accumulatorBeforeInfiniteLoop(input)}")
    }

    @Test
    fun testDay8Task2() {
        val input = FileReader.getResource("year2020/day8.txt")
        println("2020 Day 8 Task 2: ${Task2.accumulatorForNormalTermination(input)}")
    }
}