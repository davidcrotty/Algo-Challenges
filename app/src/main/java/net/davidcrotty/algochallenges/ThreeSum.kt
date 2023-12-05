package net.davidcrotty.algochallenges

class ThreeSum {

    fun threeSum(nums: IntArray): Array<IntArray> {

        val sortedNums = nums.sorted()

        var startP = 0
        var endP = nums.size - 1

        val results = mutableListOf<IntArray>()

        for(i in sortedNums.indices) {
            val start = sortedNums[startP]
            val middle = sortedNums[i + 1]
            val end = sortedNums[endP]

            val sum = start + middle + end
            if (sum == 0) {
                results.add(intArrayOf(start, middle, end))
                if (results.size == nums.size / 3) {
                    break
                }

                startP++
                endP--
            } else if (sum > 0) {
                endP--
            } else {
                startP++
            }
        }

        return results.toTypedArray()
    }
}