package others

class BinarySearchTree {

    var root: LlNode? = null

    fun insert(value: Int) {
        val newNode = LlNode(value = value)

        if(root == null) {
            root = newNode
            return
        }

        var currentNode = root!!

        while (true) {
            if (newNode.value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = newNode
                } else {
                    currentNode = currentNode.left!!
                }
                break
            } else if (newNode.value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = newNode
                } else {
                    currentNode = currentNode.right!!
                }
                break
            }
        }
    }
}

data class  LlNode(var left: LlNode? = null, var right: LlNode? = null, val value: Int)