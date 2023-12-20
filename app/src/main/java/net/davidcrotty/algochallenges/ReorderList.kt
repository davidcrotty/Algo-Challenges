package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode

class ReorderList {

    fun reorderList(head: ListNode?): ListNode {
        // n = end of list
        // 1 - n - 2 - n(-1) - 3 - n(-2)

        val listSize = getSize(head)

        // loop and alternate each one


        // add in inner loop for n - 1 using size

        return ListNode(0)
    }

    private fun getSize(head: ListNode?): Int {
        var current = head

        // get size
        var listSize = 0
        while (current != null) {
            current = current.next
            listSize++
        }

        return listSize
    }
 }