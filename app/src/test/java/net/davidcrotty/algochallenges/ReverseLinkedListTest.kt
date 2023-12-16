package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.util.LinkedList

class ReverseLinkedListTest {

    @Test
    fun reverseLinkedList() {
        val input = LinkedList(listOf(1, 2, 3, 4, 5))

        val sut = ReverseLinkedList()
        val actual = sut.reverseLinkedList(input)

        val expected = intArrayOf(5, 4, 3, 2, 1)
        assertArrayEquals(expected, actual)
    }
}