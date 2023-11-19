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
}