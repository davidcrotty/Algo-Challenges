package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class ProductExceptSelfTest {

    @Test
    fun productTest() {
        val expected = intArrayOf(24,12,8,6)
        val input = intArrayOf(1,2,3,4)
        val sut = ProductExceptSelf()

        val actual = sut.productExceptSelf(input)

        assertArrayEquals(expected, actual)
    }
}