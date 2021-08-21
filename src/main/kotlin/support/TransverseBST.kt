package support

object TransverseBST {

    fun traverseDFS(root: TreeNode?): List<Int> {
        val order = mutableListOf<Int>()

        return traversePostOrderDFS(root, order)
    }

    fun traverseBFS(root: TreeNode?): List<Int> {
        val queue = ArrayDeque<TreeNode?>()
        val order = mutableListOf<Int>()

        var currentNode: TreeNode? = null

        queue.addLast(root)

        while (!queue.isEmpty()) {
            currentNode = queue.removeFirst()
            order.add(currentNode!!.value)

            if (currentNode?.left != null) {
                queue.addLast(currentNode.left)
            }

            if (currentNode?.right != null) {
                queue.addLast(currentNode.right)
            }
        }

        return order
    }


    private fun traverseInOrderDFS(root: TreeNode?, order: MutableList<Int>): List<Int>  {
        if (root?.left != null) {
            traverseInOrderDFS(root.left, order)
        }

        if (root != null) {
            order.add(root.value)
        }

        if (root?.right != null) {
            traverseInOrderDFS(root.right, order)
        }

        return order
    }

    private fun traversePreOrderDFS(root: TreeNode?, order: MutableList<Int>): List<Int>  {
        if (root != null) {
            order.add(root.value)
        }

        if (root?.left != null) {
            traversePreOrderDFS(root.left, order)
        }

        if (root?.right != null) {
            traversePreOrderDFS(root.right, order)
        }

        return order
    }

    private fun traversePostOrderDFS(root: TreeNode?, order: MutableList<Int>): List<Int>  {
        if (root?.left != null) {
            traversePostOrderDFS(root.left, order)
        }

        if (root?.right != null) {
            traversePostOrderDFS(root.right, order)
        }

        if (root != null) {
            order.add(root.value)
        }

        return order
    }


    fun traverseInOrderDFS1(root: TreeNode?)  {
        print("${root?.value} ")

        if (root?.left != null) {
            traverseInOrderDFS1(root.left)
        }

        if (root?.right != null) {
            traverseInOrderDFS1(root.right)
        }
    }
}