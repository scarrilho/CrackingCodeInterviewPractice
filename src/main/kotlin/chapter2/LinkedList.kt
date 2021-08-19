package chapter2

class LinkedList(headValue: Int) {
    private var head = Node(value = headValue)
    private var tail = head
    private var length = 1

    fun append(value: Int) { // To tail
        var currentNode = Node(value = value)
        tail.next = currentNode
        tail = currentNode
        length += 1
    }

    fun prepend(value: Int) {
        var currentNode = Node(value = value)
        currentNode.next = head
        head = currentNode
        length += 1
    }

    fun insert(index: Int, value: Int) {
        val newNode = Node(value = value)

        val currentNode = traverseToIndex(index - 1)

        if (currentNode != null) {
            newNode.next = currentNode.next
            currentNode.next = newNode
            length += 1
        }
    }

    fun remove(index: Int) {
        val currentNode = traverseToIndex(index - 1)
        if (currentNode != null) {
            currentNode.next = currentNode.next?.next
            length -= 1
        }
    }

    private fun traverseToIndex(index: Int) : Node? {
        var currentIndex = 0
        var currentNode: Node? = head

        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode
            }
            currentNode = currentNode.next
            currentIndex += 1
        }

        return null
    }
}