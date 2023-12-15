package net.davidcrotty.algochallenges

class MedianSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        val smallest = if (nums1.size < nums2.size) {
            nums1
        } else {
            nums2
        }

        val largest = if (nums1.size > nums2.size) {
            nums1
        } else {
            nums2
        }

        var leftP = 0
        var rightP = smallest.size - 1
        val half = ((smallest.size + largest.size) / 2)

        while (true) {
            var smallMidP = (leftP + rightP) / 2 // smallest
            var largeMidP =  half - smallMidP - 2 // largest

            if (smallest[smallMidP] <= largest[largeMidP + 1] &&
                largest[largeMidP] <= smallest[smallMidP + 1]) {

                if (smallest.size % 2 == 0) {
                    // even case
                    val max = Math.max(smallest[smallMidP], largest[largeMidP])
                    val min = Math.min(largest[largeMidP + 1], smallest[smallMidP + 1])
                    return (max + min) / 2.0
                } else {
                    // odd case
                    return Math.min(largest[largeMidP + 1].toDouble(), smallest[smallMidP + 1].toDouble())
                }
            } else if (smallest[smallMidP] > largest[largeMidP + 1] == false) {
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