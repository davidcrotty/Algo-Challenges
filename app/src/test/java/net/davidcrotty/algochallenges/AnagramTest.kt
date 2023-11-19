package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class AnagramTest {

    @Test
    fun testWithAnagram() {
        val sut = Anagrams()
        val s = "anagram"
        val t = "nagaram"

        val result = sut.isAnagram(s, t)

        assertEquals(true, result)
    }

    @Test
    fun testWithoutAnagram() {
        val sut = Anagrams()
        val s = "rat"
        val t = "car"

        val result = sut.isAnagram(s, t)

        assertEquals(false, result)
    }
}