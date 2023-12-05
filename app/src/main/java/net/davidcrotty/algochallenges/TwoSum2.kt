package net.davidcrotty.algochallenges

class TwoSum2 {

    fun twoSum2(input: IntArray, target: Int): IntArray {

        val result = intArrayOf(0, 0)

        for (i in 0 until (input.size - 1)) {
            val left = input[i]

            val list = input.toMutableList()
            list.removeAt(i)
            val iterator = list.iterator()
            while(iterator.hasNext()) {
                val next = iterator.next()
                if (left + next == target) {
                    result[0] = left
                    result[1] = next
                    return result
                }
            }
        }

        return intArrayOf()
    }
}