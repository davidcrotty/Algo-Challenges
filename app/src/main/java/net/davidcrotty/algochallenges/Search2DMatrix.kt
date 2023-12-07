package net.davidcrotty.algochallenges

import android.graphics.Point

class Search2DMatrix {

    fun search2DMatrix(matrix: Array<IntArray>, target: Int): Boolean {



        return search(matrix, target, 0, (matrix.size - 1)  * (matrix.size - 1))
    }

    private fun search(matrix: Array<IntArray>, target: Int, start: Int, end: Int): Boolean {

        if (start >= end) return false

        val col = (end - start) / 2
        val i = col % 2
        val j = col / 2

        val mid = matrix[i][j]

        if (mid == target) {
            return true
        } else if (mid > target) {
            // left
            var endLocal = end - 1
            search(matrix, target, start, endLocal)
        } else {
            var startLocal = start + 1
            search(matrix, target, startLocal, end)
        }

        return false
    }
}