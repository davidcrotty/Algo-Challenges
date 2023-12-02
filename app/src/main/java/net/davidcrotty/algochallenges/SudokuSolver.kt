package net.davidcrotty.algochallenges

import androidx.core.text.isDigitsOnly

class SudokuSolver {

    fun solve(board: Array<Array<String>>): Boolean {

        var isValid = true

        for (columnIndexed in board.withIndex()) {
            val rowMap = mutableSetOf<Int>()
            for (rowIndexed in columnIndexed.value.withIndex()) {
                if (rowIndexed.value.matches(Regex("[0-9]"))) {
                    rowMap.add(rowIndexed.value.toInt())
                } else {
                     rowMap += 10 + rowIndexed.index // ensure we dont clash
                }
            }

            if (rowMap.size != 9) {
                isValid = false
                break
            }
        }

        return isValid
    }
}