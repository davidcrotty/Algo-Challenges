package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test

class MaxTreeDepthTest  {

    @Test
    fun maxTreeDepth() {

        val input = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val sut = MaxTreeDepth()
        val actual = sut.maxTreeDepth(input)

        val expected = 3
        assertEquals(expected, actual)
    }

}