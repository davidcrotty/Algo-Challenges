package net.davidcrotty.algochallenges

class TwoSum {

    /**
     * Return indicies in array that add up to target
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(0, 0)

        loop@ for ((i, value1) in nums.withIndex()) {

            loop2@ for((x, value2) in nums.withIndex()) {

                if(x == i) {
                    continue@loop2
                }

                if(value1 + value2 == target) {
                    result[0] = i
                    result[1] = x
                    break@loop
                }
            }

        }

        return result
    }
}