package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class LongestConsecutiveSequenceTest {

    @Test
    fun longestConsecutiveSequence() {
        val expected = 4
        val input = intArrayOf(100,4,200,1,3,2)

        val sut = LongestConsecutiveSequence()
        val actual = sut.longestConsecutive(input)

        assertEquals(expected, actual)
    }

    @Test
    fun longestConsecutiveSequence2() {
        val expected = 9
        val input = intArrayOf(0,3,7,2,5,8,4,6,0,1)

        val sut = LongestConsecutiveSequence()
        val actual = sut.longestConsecutive(input)

        assertEquals(expected, actual)
    }
}