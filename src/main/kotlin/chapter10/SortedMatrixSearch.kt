package chapter10

import others.BinarySearch

object SortedMatrixSearch {

    // O(nlogn)
    fun findElementNaive(matrix: Array<IntArray>, num: Int): Pair<Int, Int>? {
        for(rowIndex in matrix.indices) {
            val foundIndex = BinarySearch.search(matrix[rowIndex], num)

            if(foundIndex != -1) return Pair(rowIndex, foundIndex)
        }

        return null
    }


    fun findElement(matrix: Array<IntArray>, num: Int): Pair<Int, Int>? {
        // Check input

        var row = 0
        var col = matrix[0].size - 1 // last column

        while (row < matrix.size && col >= 0) {
            if (matrix[row][col] == num) {
                return Pair(row, col)
            }

            if (matrix[row][col] > num) {
                col -= 1
            } else {
                row += 1
            }
        }

        return null
    }

}