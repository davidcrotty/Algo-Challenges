package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class ThreeSumTest {

    @Test
    fun threeSum() {
        val inputs = intArrayOf(-1, 0, 1, 2, -1, -4)

        val sut = ThreeSum()
        val actual = sut.threeSum(inputs)

        val expected = arrayOf(intArrayOf(-1, -1, 2), intArrayOf(-1, 0, 1))
        assertEquals(expected.size, actual.size)
        assertArrayEquals(expected[0], actual[0])
        assertArrayEquals(expected[1], actual[1])
    }
}