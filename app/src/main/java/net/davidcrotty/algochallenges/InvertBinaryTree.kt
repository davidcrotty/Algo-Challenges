package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.TreeNode

class InvertBinaryTree {

    fun invertBinaryTree(input: TreeNode): TreeNode {
        return invert(input)
    }

    private fun invert(input: TreeNode): TreeNode {

        if (input.left == null) return input
        if (input.right == null)  return input

        val tmp = input.left
        input.left = input.right
        input.right = tmp

        invert(input.left!!)
        invert(input.right!!)

        return input
    }
}