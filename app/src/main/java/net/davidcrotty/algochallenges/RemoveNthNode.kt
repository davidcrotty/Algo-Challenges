package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.ListNode

class RemoveNthNode {

    fun removeNthNode(head: ListNode, n: Int): ListNode {

        var current: ListNode? = head
        var index = 0

        // get size
        while (current != null) {
            current = current.next
            index++
        }

        // calculate target
        var target = index - n

        // store previous target, iterate to next and re-attach
        var mutableHead = head
        var iterableHead: ListNode? = mutableHead
        var counter = 0

        var firstSegment: ListNode? = null

        while (iterableHead != null) {

            if (counter + 1 == target) {
                // store head
                firstSegment = iterableHead
            }

            if (counter == target) {
                // re-attach to first segment
                val lastSegment = iterableHead.next
                firstSegment?.next = lastSegment
            }

            // move along
            iterableHead = iterableHead.next
            counter++
        }

        return mutableHead
    }
}