package net.davidcrotty.algochallenges

class ThreeSum {

    fun threeSum(nums: IntArray): Array<IntArray> {

        var startP = 1
        var middleP = nums.size / 2
        var endP = nums.size - 1

        val results = mutableListOf<IntArray>()

        while(true) {
            val start = nums[startP]
            val middle = nums[middleP]
            val end = nums[endP]

            val sum = start + middle + end
            if (sum == 0) {
                results.add(intArrayOf(start, middle, end))

                if (results.size >= nums.size / 3) {
                    break
                }

                endP--
                startP++

                if (middleP > startP && middleP < endP) {
                    middleP++
                } else {
                    middleP--
                }

            } else {
                endP--
                startP++
            }
        }

        return results.toTypedArray()
    }
}