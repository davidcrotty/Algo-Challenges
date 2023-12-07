package net.davidcrotty.algochallenges

class BinarySearch {

    fun binarySearch(nums: IntArray, target: Int): Int {

        val result = search(target, nums, 0, nums.size - 1)

        return result
    }

    private fun search(target: Int, nums: IntArray, leftP: Int, rightP: Int): Int {
        var rightPLocal = rightP
        var leftPLocal = leftP

        val mid = (leftP + rightP) / 2
        if (nums[mid] == target) {
            return mid
        } else if (mid > target) {
            rightPLocal = mid - 1
        } else {
            leftPLocal = mid + 1
        }

        return search(target, nums, leftPLocal, rightPLocal)
    }

}