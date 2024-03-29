package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TopKElementsTest {

    @Test
    fun testTopElements() {
        val sut = TopKElements()

        val nums = intArrayOf(1,1,1,2,2,3)
        val k = 2

        val result = sut.topKFrequent(nums, k)

        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, result)
    }
}