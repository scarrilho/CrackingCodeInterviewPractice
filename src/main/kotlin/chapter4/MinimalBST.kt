package chapter4

import support.TreeNode

object MinimalBST {

    fun getMinTree(list: IntArray): TreeNode? {
        return getMinTree(list, 0, list.size - 1)
    }

    private fun getMinTree(list: IntArray, start: Int, end: Int): TreeNode? {
        if(end < start ) {
            return null
        }
        val mid: Int = (start + end) / 2

        var newNode = TreeNode(value = list[mid])

        newNode.left = getMinTree(list, start, mid-1)
        newNode.right = getMinTree(list, mid + 1, end)

        // println(newNode.value)
        return newNode
    }
}