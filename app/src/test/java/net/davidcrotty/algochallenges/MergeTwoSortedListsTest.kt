package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoSortedLists() {
        val list1 = ListNode2(1).apply {
            next = ListNode2(2).apply {
                next = ListNode2(4)
            }
        }

        val list2 = ListNode2(1).apply {
            next = ListNode2(3).apply {
                next = ListNode2(4)
            }
        }


        val sut = MergeTwoSortedLists()
        val actualHead = sut.mergeTwoLists(list1, list2)

        val expectedHead = ListNode2(1).apply {
            next = ListNode2(1).apply {
                next = ListNode2(2).apply {
                    next = ListNode2(3).apply {
                        next = ListNode2(4).apply {
                            next = ListNode2(4)
                        }
                    }
                }
            }
        }
        assertEquals(expectedHead, actualHead)
    }
}