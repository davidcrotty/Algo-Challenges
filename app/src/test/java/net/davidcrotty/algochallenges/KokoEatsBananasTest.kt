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

    @Test
    fun bananaPile2() {
        val bananaPile = intArrayOf(30,11,23,4,20)
        val hours = 5

        val sut = KokoEatsBananas()
        val actual = sut.minEatingSpeed(bananaPile, hours)

        val expected = 30
        assertEquals(expected, actual)
    }
}