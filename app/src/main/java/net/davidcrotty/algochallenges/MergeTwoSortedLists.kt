package net.davidcrotty.algochallenges

class MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode2, list2: ListNode2): ListNode2 {
        val result = ListNode2(0)
        var mutableList1: ListNode2? = list1
        var mutableList2: ListNode2? = list2
        var current = result

        while(mutableList1 != null && mutableList2 != null) {

            if (mutableList1.value > mutableList2.value) {
                current.next = mutableList2
                mutableList2 = mutableList2.next
            } else {
                current.next = mutableList1
                mutableList1 = mutableList1.next
            }

            current = current.next!!
        }

        if (mutableList1 != null) current.next = mutableList1
        if (mutableList2 != null) current.next = mutableList2

        return result.next!!
    }
}

data class ListNode2(var value: Int) {
    var next: ListNode2? = null
}