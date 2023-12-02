package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class SudokuSolverTest {

    @Test
    fun solveSudoku() {
        val board = arrayOf<Array<String>>(
            arrayOf("5","3",".",".","7",".",".",".","."),
            arrayOf("6",".",".","1","9","5",".",".","."),
            arrayOf(".","9","8",".",".",".",".","6","."),
            arrayOf("8",".",".",".","6",".",".",".","3"),
            arrayOf("4",".",".","8",".","3",".",".","1"),
            arrayOf("7",".",".",".","2",".",".",".","6"),
            arrayOf(".","6",".",".",".",".","2","8","."),
            arrayOf(".",".",".","4","1","9",".",".","5"),
            arrayOf(".",".",".",".","8",".",".","7","9")
        )

        val sut = SudokuSolver()
        val actual = sut.solve(board)

        assertEquals(true, actual)
    }
}