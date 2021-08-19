package chapter2

class DeleteNode {
    fun removeNode(targetNode: Node?): Boolean {
        var node: Node? = targetNode

        if (node == null) {
            return false
        }

        if (node.next != null) {
            node.value = node.next!!.value
            node.next = node.next?.next
        } else {
            println("Doesn't work if tail node")
        }

        return true
    }
}