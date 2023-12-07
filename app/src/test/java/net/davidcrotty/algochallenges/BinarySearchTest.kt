package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class BinarySearchTest {
    @Test
    fun binarySearch() {
        val input = intArrayOf(-1,0,3,5,9,12)
        val target = 9
        val sut = BinarySearch()

        val actual = sut.binarySearch(input, target)

        val expected = 4
        assertEquals(expected, actual)
    }
}