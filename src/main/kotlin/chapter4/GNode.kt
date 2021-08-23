package chapter4

class GNode(vertex: String, adjacentLength: Int) {
    private var adjacent: Array<GNode?> = arrayOfNulls(adjacentLength)
    var adjacentCount = 0
    private var vertex: String = vertex
    var state: State? = null


    fun addAdjacent(x: GNode?) {
        if (adjacentCount < adjacent.size) {
            adjacent[adjacentCount] = x
            adjacentCount++
        } else {
            print("No more adjacent can be added")
        }
    }

    fun getAdjacent(): Array<GNode?> {
        return adjacent
    }

    fun getVertex(): String {
        return vertex
    }
}