package net.davidcrotty.algochallenges

class TwoSum2 {

    fun twoSum2(input: IntArray, target: Int): IntArray {

        val result = intArrayOf(0, 0)

        for (i in 0 until (input.size - 1)) {
            val left = input[i]

            val list = input.toMutableList()
            list.removeAt(i)
            val iterator = list.iterator().withIndex()
            while(iterator.hasNext()) {
                val next = iterator.next()
                if (left + next.value == target) {
                    val normalised = i + 1
                    result[0] = normalised
                    result[1] = next.index + normalised + 1
                    return result
                }
            }
        }

        return intArrayOf()
    }
}