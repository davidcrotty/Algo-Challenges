package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.TreeNode

class InvertBinaryTree {

    fun invertBinaryTree(input: TreeNode): TreeNode {
        return invert(input)
    }

    private fun invert(input: TreeNode): TreeNode {
        val tmp = input.left
        input.left = input.right
        input.right = tmp
        return input
    }
}