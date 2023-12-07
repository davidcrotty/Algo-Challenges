package net.davidcrotty.algochallenges

import android.graphics.Point

class Search2DMatrix {

    fun search2DMatrix(matrix: Array<IntArray>, target: Int): Boolean {



        return search(matrix, target, 0, (matrix.size * matrix.size) - 1)
    }

    private fun search(matrix: Array<IntArray>, target: Int, start: Int, end: Int): Boolean {

         if (start >= end) return false

        val col = matrix[0].size
        val mid = (start + end) / 2
        val j = mid % col
        val i = mid / col

        return if (matrix[i][j] == target) {
            return true
        } else if (target < matrix[i][j]) {
            // left
            var endLocal = mid - 1
            search(matrix, target, start, endLocal)
        } else {
            var startLocal = mid + 1
            search(matrix, target, startLocal, end)
        }
    }
}