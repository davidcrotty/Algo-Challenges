package net.davidcrotty.algochallenges

class SudokuSolver {

    fun solve(board: Array<Array<Char>>): Boolean {

        // row
        for (row in board.withIndex()) {

            val rowSet = mutableSetOf<Char>()
            for(cell in row.value.withIndex()) {
                 if(cell.value == '.') continue
                 if(!rowSet.add(cell.value)) return false
            }
        }

        return true
    }
}