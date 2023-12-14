package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MedianSortedArraysTest {

    @Test
    fun testMedianSortedArrays() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)

        val sut = MedianSortedArrays()
        val actual = sut.findMedianSortedArrays(nums1, nums2)

        val expected = 2.0
        assertEquals(expected, actual)
    }

}