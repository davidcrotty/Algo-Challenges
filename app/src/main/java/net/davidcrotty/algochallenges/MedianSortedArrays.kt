package net.davidcrotty.algochallenges

class MedianSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var nums1Local = nums1
        var nums2Local = nums2

        if (nums1Local.size > nums2Local.size) {
            nums1Local = nums2Local
            nums2Local = nums1Local
        }

        val m: Int = nums1Local.size
        val n: Int = nums2Local.size
        var low = 0
        var high = m

        while (low <= high) {
            val partitionX = (low + high) / 2 // smallest
            val partitionY = (m + n + 1) / 2 - partitionX // largest

            val maxX = if (partitionX === 0) Int.MIN_VALUE else nums1[partitionX - 1]
            val maxY = if (partitionY === 0) Int.MIN_VALUE else nums2[partitionY - 1]

            val minX = if (partitionX === m) Int.MAX_VALUE else nums1[partitionX]
            val minY = if (partitionY === n) Int.MAX_VALUE else nums2[partitionY]

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY).toDouble()
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        return 0.0
    }
}