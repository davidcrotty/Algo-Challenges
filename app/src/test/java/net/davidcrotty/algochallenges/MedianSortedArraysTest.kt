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

    @Test
    fun testMedianSortedArrays2() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)

        val sut = MedianSortedArrays()
        val actual = sut.findMedianSortedArrays(nums1, nums2)

        val expected = 2.5
        assertEquals(expected, actual)
    }

    @Test
    fun testMedianSortedArrays3() {
        val nums1 = intArrayOf(1, 2, 2, 3)
        val nums2 = intArrayOf(3, 4, 4)

        val sut = MedianSortedArrays()
        val actual = sut.findMedianSortedArrays(nums1, nums2)

        val expected = 3.0
        assertEquals(expected, actual)
    }

    @Test
    fun testMedianSortedArrays4() {
        val nums1 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val nums2 = intArrayOf(1, 2, 3, 4, 5)

        val sut = MedianSortedArrays()
        val actual = sut.findMedianSortedArrays(nums1, nums2)

        val expected = 4.0
        assertEquals(expected, actual)
    }

}