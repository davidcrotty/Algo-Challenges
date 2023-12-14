package net.davidcrotty.algochallenges

class MedianSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        // find partition
        val totalSize = nums1.size + nums2.size

        val smallest = Math.min(nums1.size, nums2.size)
        val smallestArray = if (smallest == nums1.size) {
            nums1
        } else {
            nums2
        }

        val largest = Math.max(nums1.size, nums2.size)
        val largestArray = if (smallest == nums1.size) {
            nums2
        } else {
            nums1
        }

        var smallLeftP = 0
        var smallRightP = smallestArray.size - 1

        // loop
        while(smallLeftP < smallRightP) {
            var smallestLeftMid = (smallLeftP + smallRightP) / 2

            val largestLeftMid = (totalSize / 2) - smallestLeftMid

            // validate partition
            if (smallestArray[smallestLeftMid] <= largestArray[largestLeftMid + 1] == false ||
                largestArray[largestLeftMid] <= smallestArray[smallestLeftMid + 1] == false) {
                smallestLeftMid++
                smallLeftP = smallestLeftMid
            } else {
                // if even total
                if (totalSize % 2 == 0) {
                    val maxLeft = Math.max(smallestArray[smallestLeftMid] , largestArray[smallestLeftMid])
                    val maxRight = Math.min(smallestArray[smallestLeftMid + 1], largestArray[smallestLeftMid + 1])
                    return (maxLeft + maxRight) / 2.0
                } else {
                    return Math.min(smallestArray[smallestLeftMid].toDouble(), largestArray[largestLeftMid].toDouble())
                }
                // take min/max from both right/left
                // else min between mid 2
            }

        }

        return 0.0
    }
}