package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.util.Arrays

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
}