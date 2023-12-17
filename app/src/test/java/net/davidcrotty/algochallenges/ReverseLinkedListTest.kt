package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
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

        val expected = ListNode(5).apply {
            next = ListNode(4).apply {
                next = ListNode(3).apply {
                    next = ListNode(2).apply {
                        next = ListNode(1)
                    }
                }
            }
        }

        assertEquals(expected.current, actual.current)
        assertEquals(expected.next!!.current, actual.next!!.current)
    }
}