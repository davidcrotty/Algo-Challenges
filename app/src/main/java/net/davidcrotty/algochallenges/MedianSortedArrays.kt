package net.davidcrotty.algochallenges

import java.lang.Double.NEGATIVE_INFINITY
import java.lang.Double.POSITIVE_INFINITY

class MedianSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        var smallest = if (nums1.size < nums2.size) {
            nums1
        } else {
            nums2
        }

        var largest = if (nums1.size > nums2.size) {
            nums1
        } else {
            nums2
        }

        if (nums1.size == nums2.size) {
            largest = nums1
            smallest = nums2
        }

        var leftP = 0
        var rightP = smallest.size - 1
        val half = Math.floorDiv(smallest.size + largest.size, 2)

        while (true) {
            var smallMidP = Math.floorDiv(leftP + rightP, 2) // smallest
            var largeMidP =  half - smallMidP - 2 // largest

            // both array extremes need accounting for
            val leftMiddle = if (smallMidP < 0) NEGATIVE_INFINITY else smallest[smallMidP].toDouble()
            val leftNext = if (smallMidP + 1 > smallest.size) POSITIVE_INFINITY else smallest[smallMidP + 1].toDouble()
            val rightNext = if (largeMidP + 1 > largest.size) POSITIVE_INFINITY else largest[largeMidP + 1].toDouble()
            val rightMiddle = if (largeMidP < 0) NEGATIVE_INFINITY else largest[largeMidP].toDouble()

            if (leftMiddle <= rightNext &&
                rightMiddle <= leftNext) {

                if (smallest.size % 2 == 0) {
                    // even case
                    val max = Math.max(leftMiddle, rightMiddle)
                    val min = Math.min(leftNext, rightNext)
                    return (max + min) / 2.0
                } else {
                    // odd case
                    return Math.min(rightNext, leftNext)
                }
            } else if (leftMiddle > rightNext) {
                // smallest is wrong
                rightP = smallMidP - 1
            } else {
                // largest is wrong
                leftP = smallMidP + 1
            }
        }

        return 0.0
    }
}