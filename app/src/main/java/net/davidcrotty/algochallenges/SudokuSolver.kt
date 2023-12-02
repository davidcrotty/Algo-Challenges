package net.davidcrotty.algochallenges

import androidx.core.text.isDigitsOnly

class SudokuSolver {

    fun solve(board: Array<Array<String>>): Boolean {

        for(col in board.indices) {
            val colSet = mutableSetOf<Char>()
            val rowSet = mutableSetOf<Char>()
            val cube = mutableSetOf<Char>()

            for (row in board.indices) {
                val c = board[col][row]
                val r = board[row][col]

                if (c != "." && !colSet.add(c.toCharArray().first())) {
                    return false
                }
                if (r != "." && !rowSet.add(r.toCharArray().first())) {
                    return false
                }

            }
        }

        return true
    }
}