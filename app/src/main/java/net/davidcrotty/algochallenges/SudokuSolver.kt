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

            // walk down
            val columnSet = mutableSetOf<Char>()
            for(index in board.indices) {
                val cell = board[index][row.index]
                if(cell == '.') continue
                if(!columnSet.add(cell)) return false
            }
        }

        return true
    }
}