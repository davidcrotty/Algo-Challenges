package net.davidcrotty.algochallenges

class TwoSum {

    /**
     * Return indicies in array that add up to target
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val tracker = mutableMapOf<Int, Int>()

        for ((i, value) in nums.withIndex()) {
            if (tracker.containsKey(nums[i])) {
                // exit condition
                val left = tracker[nums[i]]!!
                return intArrayOf(left, i)
            } else {
                tracker[target - nums[i]] = i
            }
        }

        return intArrayOf(0, 0)
    }
}