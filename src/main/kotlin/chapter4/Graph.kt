package chapter4

class Graph {

    var MAX_VERTICES = 6
    private var vertices: Array<GNode?>  = arrayOfNulls(MAX_VERTICES)
    var count = 0

    fun addNode(x: GNode?) {
        if (count < vertices.size) {
            vertices[count] = x
            count++
        } else {
            print("Graph full")
        }
    }

    fun getNodes(): Array<GNode?> {
        return vertices
    }
}