package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TwoSum2Test {

    @Test
    fun twoSum2() {
        val input = intArrayOf(2,7,11,15)
        val target = 9

        val sut = TwoSum2()
        val actual = sut.twoSum2(input, target)

        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum22() {
        val input = intArrayOf(2,3,4)
        val target = 6

        val sut = TwoSum2()
        val actual = sut.twoSum2(input, target)

        val expected = intArrayOf(1, 3)
        assertArrayEquals(expected, actual)
    }
}