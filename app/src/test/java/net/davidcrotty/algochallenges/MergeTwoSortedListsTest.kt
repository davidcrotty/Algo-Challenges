package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoSortedLists() {
        val list1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        }

        val list2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }


        val sut = MergeTwoSortedLists()
        val actualHead = sut.mergeTwoLists(list1, list2)

        val expectedHead = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(4)
                        }
                    }
                }
            }
        }
        assertEquals(expectedHead, actualHead)
    }
}