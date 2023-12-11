package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumRotatedSortedArrayTest {

    @Test
    fun findMin() {
        val nums = intArrayOf(3, 4, 5, 1, 2)
        val sut = MinimumRotatedSortedArray()

        val actual = sut.findMin(nums)

        val expected = 1
        assertEquals(expected, actual)
    }
}