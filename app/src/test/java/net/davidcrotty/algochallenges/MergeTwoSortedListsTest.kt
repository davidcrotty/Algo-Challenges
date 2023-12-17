package net.davidcrotty.algochallenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoSortedLists() {
        val list1 = ListNode2().apply {
            value = 1
            next = ListNode2().apply {
                value = 2
                next = ListNode2().apply {
                    value = 4
                }
            }
        }

        val list2 = ListNode2().apply {
            value = 1
            next = ListNode2().apply {
                value = 3
                next = ListNode2().apply {
                    value = 4
                }
            }
        }


        val sut = MergeTwoSortedLists()
        val actualHead = sut.mergeTwoLists(list1, list2)

        val expectedHead = ListNode2().apply {
            value = 1
            next = ListNode2().apply {
                value = 1
                next = ListNode2().apply {
                    value = 2
                    next = ListNode2().apply {
                        value = 3
                        next = ListNode2().apply {
                            value = 4
                            next = ListNode2().apply {
                                value = 4
                            }
                        }
                    }
                }
            }
        }
        assertEquals(expectedHead, actualHead)
    }
}