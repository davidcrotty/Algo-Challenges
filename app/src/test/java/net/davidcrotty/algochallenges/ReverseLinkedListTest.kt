package net.davidcrotty.algochallenges

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class ReverseLinkedListTest {

    @Test
    fun reverseLinkedList() {
        val input = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val sut = ReverseLinkedList()
        val actual = sut.reverseLinkedList(input)

        val expected = intArrayOf(5, 4, 3, 2, 1)
        assertArrayEquals(expected, actual)
    }
}