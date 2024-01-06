package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test

class InvertBinaryTreeTest {

    @Test
    fun invertBinaryTreeSmall() {
        val input = smallTree()

        val sut = InvertBinaryTree()
        val actual = sut.invertBinaryTree(input)

        val expected = smallTreeInverted()
        assertEquals(expected, actual)
        assertEquals(expected.left, actual.left)
        assertEquals(expected.right, actual.right)
    }

    fun smallTree(): TreeNode {
        return TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
    }

    fun smallTreeInverted(): TreeNode {
        return TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(1)
        }
    }
}