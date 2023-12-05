package net.davidcrotty.algochallenges

class TwoSum2 {

    fun twoSum2(input: IntArray, target: Int): IntArray {

        val result = intArrayOf(0, 0)
        var start = 1
        var finish = input.size

        while(true) {
            val first = input[start - 1]
            val last = input[finish - 1]

            val sum = first + last
            if (sum == target) {
                result[0] = start
                result[1] = finish
                break
            } else if (sum > target) {
                finish--
            } else {
                start++
            }
        }

        return result
    }
}