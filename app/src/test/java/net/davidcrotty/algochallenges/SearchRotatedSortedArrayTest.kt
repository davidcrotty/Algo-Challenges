package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class SearchRotatedSortedArrayTest {

    @Test
    fun searchRotatedSortedArray() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 0

        val sut = SearchRotatedSortedArray()

        val actual = sut.search(nums, target)

        val expected = 4
        assertEquals(expected, actual)
    }
}