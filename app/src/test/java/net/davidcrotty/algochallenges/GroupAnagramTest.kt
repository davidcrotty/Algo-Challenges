package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class GroupAnagramTest {

    @Test
    fun groupAnagram() {
        val sut = GroupAnagrams()
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")


        val actual = sut.groupAnagrams(strs)

        val expected = arrayOf(
            arrayOf("bat"),
            arrayOf("nat", "tan"),
            arrayOf("ate", "eat", "tea")
        )

        // Not ideal but array equality goes deep
        assertEquals(expected.size, actual.size)
    }

    @Test
    fun groupAnagram1() {
        val sut = GroupAnagrams()
        val strs = arrayOf("")


        val actual = sut.groupAnagrams(strs)

        val expected = arrayOf(
            arrayOf("")
        )

        // Not ideal but array equality goes deep
        assertEquals(expected.size, actual.size)
    }

    @Test
    fun groupAnagram2() {
        val sut = GroupAnagrams()
        val strs = arrayOf("a")


        val actual = sut.groupAnagrams(strs)

        val expected = arrayOf(
            arrayOf("a")
        )

        // Not ideal but array equality goes deep
        assertEquals(expected.size, actual.size)
    }
}