package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TwoSumTest {

    @Test
    fun twoSum() {
        val sut = TwoSum()
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        val result = sut.twoSum(nums, target)

        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }

    @Test
    fun twoSum2() {
        val sut = TwoSum()
        val nums = intArrayOf(3,2,4)
        val target = 6

        val result = sut.twoSum(nums, target)

        assertEquals(1, result[0])
        assertEquals(2, result[1])
    }

    @Test
    fun twoSum3() {
        val sut = TwoSum()
        val nums = intArrayOf(3, 3)
        val target = 6

        val result = sut.twoSum(nums, target)

        assertEquals(0, result[0])
        assertEquals(1, result[1])
    }
}