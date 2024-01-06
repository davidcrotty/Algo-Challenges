package net.davidcrotty.algochallenges

import net.davidcrotty.algochallenges.data.TreeNode

class MaxTreeDepth {

    fun maxTreeDepth(input: TreeNode): Int {
        return dfs(input)
    }

    private fun dfs(root: TreeNode?): Int {
        if (root == null) return 0 // base case

        return 1 + Math.max(dfs(root.left), dfs(root.right))
    }
}