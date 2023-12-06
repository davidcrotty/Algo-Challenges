package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class ContainerWithMostWaterTest {

    @Test
    fun containerWithMostWater() {
        val inputLines = intArrayOf(1,8,6,2,5,4,8,3,7)
        val sut = ContainerWithMostWater()

        val actual = sut.containerWithMostWater(inputLines)

        val expectedArea = 49
        assertEquals(expectedArea, actual)
    }
}