package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveNthNodeTest {

    @Test
    fun removeNthNode() {
        val n = 2

        val sut = RemoveNthNode()
        val result = sut.removeNthNode(n)

        assertEquals(removedItem(), result)
    }

    fun removedItem(): ListNode {
        return ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(5)
                }
            }
        }
    }
}