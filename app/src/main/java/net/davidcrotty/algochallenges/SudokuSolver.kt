package net.davidcrotty.algochallenges

import android.graphics.Point

class SudokuSolver {

    val cubes = listOf(
        Pair(0, 0),
        Pair(0, 3),
        Pair(0, 6),
        Pair(3, 0),
        Pair(3, 3),
        Pair(3, 6),
        Pair(6, 0),
        Pair(6, 3),
        Pair(6, 6)
    )

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

            // cube
            val cubeSet = mutableSetOf<Char>()
            val cube = cubes[row.index]
            for(x in cube.first..cube.first + 2) {
                for (y in cube.second..cube.second + 2) {
                    val cell = board[x][y]
                    if(cell == '.') continue
                    if(!cubeSet.add(cell)) return false
                }
            }
        }

        return true
    }
}