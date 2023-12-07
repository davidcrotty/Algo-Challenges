package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class BinarySearchTest {
    @Test
    fun binarySearch() {
        val input = intArrayOf(-1,0,3,5,9,12)
        val sut = BinarySearch()

        val actual = sut.binarySearch(input)

        val expected = 4
        assertEquals(expected, actual)
    }
}