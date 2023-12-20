package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode

class ReorderList {

    fun reorderList(head: ListNode?): ListNode {
        // n = end of list
        // 1 - n - 2 - n(-1) - 3 - n(-2)

        val listSize = getSize(head)

        // loop and alternate each one
        var current: ListNode? = head
        var result: ListNode? = ListNode(0)
        var resultHead = result // so we can keep track of list head

        while (current != null) {
            // just reform list
            var nxt = current.next // preserve list
            result?.next = current // apply node to result
            current.next = null // break link
            current = nxt // shift along
            result = result?.next // shift along list head
        }


        // add in inner loop for n - 1 using size

        return resultHead?.next!!
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