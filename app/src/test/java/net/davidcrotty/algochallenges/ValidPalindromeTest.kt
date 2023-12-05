package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class ValidPalindromeTest {

    @Test
    fun validPalindrome() {

        val input = "A man, a plan, a canal: Panama"

        val sut = ValidPalindrome()
        val actual = sut.isPalindrome(input)

        val expected = true
        assertEquals(expected, actual)
    }
}