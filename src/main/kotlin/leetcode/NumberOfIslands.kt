package leetcode

object NumberOfIslands {

    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0

        for (i in grid.indices) {
            for (j in 0 until grid[0].size) {
                if (grid[i][j] == '1') {
                    sinkIsland(grid, i, j)
                    count += 1
                }
            }
        }

        return count
    }

    private fun sinkIsland(grid: Array<CharArray>, row: Int, col: Int) {

        if (row < 0 || col < 0 || row >= grid.size || col >= grid[0].size || grid[row][col] == '0') return

        grid[row][col] = '0'
        sinkIsland(grid, row+1,col)
        sinkIsland(grid, row-1,col)
        sinkIsland(grid, row,col+1)
        sinkIsland(grid, row,col-1)

    }
}