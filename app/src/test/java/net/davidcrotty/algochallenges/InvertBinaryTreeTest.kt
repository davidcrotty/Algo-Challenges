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
        assertEquals(expected.left, actual!!.left)
        assertEquals(expected.right, actual!!.right)
    }

    @Test
    fun invertBinaryTreeLarge() {
        val input = largeTree()

        val sut = InvertBinaryTree()
        val actual = sut.invertBinaryTree(input)

        val expected = largeTreeInverted()
        assertEquals(expected, actual)

        // L1
        assertEquals(expected.left, actual!!.left)
        assertEquals(expected.right, actual!!.right)

        // L2 one side
        assertEquals(expected.left!!.left, actual.left!!.left)
        assertEquals(expected.left!!.right, actual.left!!.right)

        // L2 other side
        assertEquals(expected.right!!.left, actual.right!!.left)
        assertEquals(expected.right!!.right, actual.right!!.right)
    }

    fun largeTree(): TreeNode {
        return TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(7).apply {
                left = TreeNode(6)
                right = TreeNode(9)
            }
        }
    }

    fun largeTreeInverted(): TreeNode {
        return TreeNode(4).apply {
            left = TreeNode(7).apply {
                left = TreeNode(9)
                right = TreeNode(6)
            }
            right = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(1)
            }
        }
    }

    private fun smallTree(): TreeNode {
        return TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
    }

    private fun smallTreeInverted(): TreeNode {
        return TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(1)
        }
    }
}