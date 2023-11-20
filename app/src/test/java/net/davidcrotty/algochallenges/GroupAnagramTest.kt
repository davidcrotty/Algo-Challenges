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
        assertEquals(expected, actual)
    }
}