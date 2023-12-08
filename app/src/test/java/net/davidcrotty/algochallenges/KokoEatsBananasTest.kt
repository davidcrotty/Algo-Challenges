package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class KokoEatsBananasTest {

    @Test
    fun bananaPile() {
        val bananaPile = intArrayOf(3,6,7,11)
        val hours = 8

        val sut = KokoEatsBananas()
        val actual = sut.minEatingSpeed(bananaPile, hours)

        val expected = 4
        assertEquals(expected, actual)
    }
}