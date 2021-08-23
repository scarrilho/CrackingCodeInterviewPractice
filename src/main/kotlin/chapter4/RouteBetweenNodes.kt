package chapter4

import java.util.*

object RouteBetweenNodes {

    fun findViaBFS(g: Graph, start: GNode, end: GNode): Boolean {
        if (start == end) return true

        // Queue
        var queue = LinkedList<GNode>()

        for (node in g.getNodes()) {
            node?.state = State.Unvisited
        }

        start.state = State.Visiting
        queue.add(start)

        while(!queue.isEmpty()) {
            var node = queue.removeFirst()

            if (node != null){
                for (adjacent in node.getAdjacent()) {

                    if (adjacent?.state == State.Unvisited) {
                        if (adjacent == end) {
                            return true
                        } else {
                            adjacent.state = State.Visiting
                            queue.add(adjacent)
                        }
                    }
                }
            }
            node.state = State.Visited
        }

        return false
    }


    fun findViaDFS(g: Graph, start: GNode, end: GNode): Boolean {
        if (start == end) return true
        
        for (node in g.getNodes()) {
            node?.state = State.Unvisited
        }

        return findViaDFS(start, end)
    }

    private fun findViaDFS(start: GNode, end: GNode): Boolean {
        if (start == null) return false
        if (start == end) return true
        
        start.state = State.Visiting

        for (adjacent in start.getAdjacent()) {
            println(adjacent?.getVertex())
            if (adjacent?.state == State.Unvisited) {
                return if (adjacent == end) {
                    println("found ${adjacent?.getVertex()}")
                    true
                } else {
                    adjacent.state = State.Visited
                    findViaDFS(adjacent, end)
                }
            }
        }
        return false
    }
}