package net.davidcrotty.algochallenges

class MinimumRotatedSortedArray {

    fun findMin(nums: IntArray): Int {

        var left = 0
        var right = nums.size

        while (left < right) {
            var mid = (left + right) / 2

            val midValue = nums[mid]

            if (midValue > nums[mid - 1] && midValue > nums[mid + 1]) {
                return Math.min(nums[mid - 1], nums[mid + 1])
            } else if (midValue < nums[mid - 1]) {
                mid--
                left = mid
            } else {
                mid++
                right = mid
            }

        }

        return -1
    }
}