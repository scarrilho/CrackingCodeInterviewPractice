package leetcode

object GameOfLife {
    private val willDie = 2
    private val willLive = 3

    fun gameOfLife(board: Array<IntArray>): Unit {
        val rowSize = board.size
        val colSize = board[0].size

        for (i in 0 until rowSize) {
            for (j in 0 until colSize) {
                val aliveAround = getNumAliveAround(board, i, j)
                if ( board[i][j] == 1) {
                    if (aliveAround < 2 || aliveAround > 3) {
                        board[i][j] = willDie
                    } else {
                        // keep alive
                    }
                } else if (board[i][j] == 0 && aliveAround == 3) {
                    board[i][j] = willLive
                }
            }
        }

        for (i in 0 until rowSize) {
            for (j in 0 until colSize) {
                if (board[i][j] == willDie) {
                    board[i][j] = 0
                } else if (board[i][j] == willLive) {
                    board[i][j] = 1
                }
            }
        }
    }

    private fun getNumAliveAround(board: Array<IntArray>, row: Int, col: Int): Int {
        var count = 0

        val around: Array<IntArray> = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(-1, 0),
            intArrayOf(0, 1),
            intArrayOf(0, -1),
            intArrayOf(1, 1),
            intArrayOf(1, -1),
            intArrayOf(-1, 1),
            intArrayOf(-1, -1)
        )

        for (cell in around) {
            val tmpRow = row + cell[0]
            val tmpCol = col + cell[1]

            if (tmpRow < board.size && tmpCol < board[0].size && tmpRow >= 0 && tmpCol >= 0) {
                if (board[tmpRow][tmpCol] == 1 || board[tmpRow][tmpCol] == willDie) {
                    count ++
                }
            }
        }

        return count
    }

}