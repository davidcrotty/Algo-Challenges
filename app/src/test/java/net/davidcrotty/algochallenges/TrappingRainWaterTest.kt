package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class TrappingRainWaterTest {

    @Test
    fun trappingRainWater() {
        val height = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)

        val sut = TrappingRainWater()
        val actual = sut.trapRainWater(height)

        val expected = 6
        assertEquals(expected, actual)
    }

    @Test
    fun trappingRainWater2() {
        val height = intArrayOf(4,2,0,3,2,5)

        val sut = TrappingRainWater()
        val actual = sut.trapRainWater(height)

        val expected = 9
        assertEquals(expected, actual)
    }
}