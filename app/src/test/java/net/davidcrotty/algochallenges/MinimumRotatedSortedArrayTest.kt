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

    @Test
    fun findMin2() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val sut = MinimumRotatedSortedArray()

        val actual = sut.findMin(nums)

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun findMin3() {
        val nums = intArrayOf(11,13,15,17)
        val sut = MinimumRotatedSortedArray()

        val actual = sut.findMin(nums)

        val expected = 11
        assertEquals(expected, actual)
    }
}