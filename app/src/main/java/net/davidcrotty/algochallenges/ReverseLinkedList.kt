package net.davidcrotty.algochallenges

class ReverseLinkedList {

    fun reverseLinkedList(head: ListNode): ListNode {

        var prev: ListNode? = null
        var current: ListNode? = head

        while (current != null) {
            var nxt = current.next // temp
            current.next = prev // assign to null / last previous (breaking link first pass)
            prev = current // shift back head
            current = nxt // move head to front
        }

        return prev!!
    }
}

class ListNode(var current: Int) {
    var next: ListNode? = null
}