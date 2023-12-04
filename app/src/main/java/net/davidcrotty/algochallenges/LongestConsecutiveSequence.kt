package net.davidcrotty.algochallenges

class LongestConsecutiveSequence {

    fun longestConsecutive(nums: IntArray) : Int {

        nums.sort()
        val numList = nums.toList()
        val iterator = numList.listIterator()

        // loop using iterator, if next != current +1, store
        var right: Int = -1
        val longestList = mutableListOf<Int>()
        var longest = 1

        while(iterator.hasNext()) {
            val current = iterator.next()
            if (iterator.hasNext()) {
                val right = iterator.next()
                iterator.previous()

                if (current + 1 == right) {
                    // store sequence
                    longest++
                } else {
                    longestList.add(longest)
                    longest = 1
                    // null sequence, move
                }
            }
        }

        if (longest != 1) {
            longestList.add(longest)
        }

        longestList.sort()

        return longestList.last()
    }
}