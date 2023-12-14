package net.davidcrotty.algochallenges

class MedianSortedArrays {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        var start1P = 0
        var end1P = nums1.size - 1

        var start2P = 0
        var end2P = nums2.size - 1

        val is1Even = (nums1.size % 2) == 0
        val is2Even = (nums2.size % 2) == 0

        val mid1P = (start1P + end1P) / 2
        val mid2P = (start2P + end2P) / 2

        if(!is1Even && !is2Even) {
            return (nums1[mid1P] + nums2[mid2P]) / 2.0
        }

        if(is1Even && is2Even) {
            // TODO bounds check
            val median1 =  (nums1[mid1P] + nums1[mid1P + 1]) / 2.0
            val median2 =  (nums2[mid2P] + nums2[mid2P + 1]) / 2.0
            return (median1 + median2) / 2.0
        }

        if (is1Even && !is2Even) {
            val median1 = (nums1[mid1P] + nums1[mid1P + 1]) / 2.0
            val median2 = nums2[mid2P]
            return (median1 + median2) / 2.0
        } else {
            val median1 = nums1[mid1P]
            val median2 =  (nums2[mid2P] + nums2[mid2P + 1]) / 2.0
            return (median1 + median2) / 2.0
        }



        return 0.0
    }
}