package chapter1

object ZeroMatrix {

    fun getZeroMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val zeroRows = hashSetOf<Int>()
        val zeroColumns = hashSetOf<Int>()

// TODO: Validate matrix input (empty?)

        val numRows = matrix.size
        val numCols = matrix[0].size
        val zeroRowTemplate = IntArray(numCols) { 0 } // Init all with zero

// O(N)
        val resultMatrix = matrix

// O(N)
        for(rowIndex in 0 until numRows) {
            for(colIndex in 0 until numCols) {
                if(matrix[rowIndex][colIndex] == 0) {
                    zeroRows.add(rowIndex)
                    zeroColumns.add(colIndex)
                }
            }
        }

// O(N)
        for(rowIndex in 0 until numRows) {
            if(zeroRows.contains(rowIndex)) {
                resultMatrix[rowIndex] = zeroRowTemplate
                continue
            }

            for(columnIndex in 0 until numCols) {
                if(zeroColumns.contains(columnIndex)) {
                    resultMatrix[rowIndex][columnIndex] = 0
                }
            }
        }

        return resultMatrix
    }

    // Change passed array in place
    fun getZeroMatrixV2(matrix: Array<IntArray>): Array<IntArray> {
        val zeroColumns = hashSetOf<Int>()

// TODO: Validate matrix input (empty?)
        val numRows = matrix.size
        val numCols = matrix[0].size
        val zeroRowTemplate = IntArray(numCols) { 0 } // Init all with zero

// O(N)
        for(rowIndex in 0 until numRows) {

            var isZeroRowFound = false

            for(colIndex in 0 until numCols) {
                if(matrix[rowIndex][colIndex] == 0) {
                    zeroColumns.add(colIndex)
                    isZeroRowFound = true
                } else {
                    if(zeroColumns.contains(colIndex)) {
                        matrix[rowIndex][colIndex] = 0
                    }
                }
            }

            if (isZeroRowFound) {
                matrix[rowIndex] = zeroRowTemplate
            }

        }

        return matrix
    }
}