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

        var index = 0

        while (current != null) {
            if (index > 0) { // mod this later
                // reverse list and splice on end
                var reversed = reverse(current)
                var nxt = reversed.next
                result?.next = reversed
                reversed.next = null
                current = nxt

                result = result?.next // shift along list head
            } else {
                var nxt = current.next // preserve list
                result?.next = current // apply node to result
                current.next = null // break link
                current = nxt // shift along

                result = result?.next // shift along list head
            }
            index++
        }


        // add in inner loop for n - 1 using size

        return resultHead?.next!!
    }

    private fun reverse(head: ListNode): ListNode {

        var current: ListNode? = head
        var prev: ListNode? = null

        while (current != null) {
            val nxt = current.next // stash
            current.next = prev // break link
            prev = current // attach
            current = nxt // continue if not null
        }

        return prev!!
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