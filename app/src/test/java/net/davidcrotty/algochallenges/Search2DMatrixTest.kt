package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class Search2DMatrixTest {

    @Test
    fun search2DMatrix() {
        val matrix = arrayOf(
            intArrayOf(1,3,5,7),
            intArrayOf(10,11,16,20),
            intArrayOf(23,30,34,60)
        )
        val target = 3

        val sut = Search2DMatrix()
        val actual = sut.search2DMatrix(matrix, target)

        val expected = true
        assertEquals(expected, actual)
    }

    @Test
    fun search2DMatrix2() {
        val matrix = arrayOf(
            intArrayOf(1,3,5,7),
            intArrayOf(10,11,16,20),
            intArrayOf(23,30,34,60)
        )
        val target = 13

        val sut = Search2DMatrix()
        val actual = sut.search2DMatrix(matrix, target)

        val expected = false
        assertEquals(expected, actual)
    }

}