package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class ReorderListTest {

    @Test
    fun reorderList() {
        val input = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val sut = ReorderList()
        val actual = sut.reorderList(input)

        val expected = ListNode(1).apply {
            next = ListNode(5).apply {
                next = ListNode(2).apply {
                    next = ListNode(4).apply {
                        next = ListNode(3)
                    }
                }
            }
        }

        assertEquals(expected, actual)
    }
}