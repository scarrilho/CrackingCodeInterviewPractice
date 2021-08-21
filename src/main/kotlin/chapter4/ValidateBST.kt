package chapter4

import support.TreeNode
import support.WrapInt

object ValidateBST {
    var lastPrinted: Int? = null

    fun validateTree(node: TreeNode?): Boolean {
        val result = mutableListOf<Int>()
        copyTreeToList(node, result)

        println("Array values: $result")

        for(i in 1 until result.size) {
            if(result[i-1] >= result[i]) {
                return false
            }
        }
        return true
    }



    private fun copyTreeToList(node: TreeNode?, result: MutableList<Int>) {
        if(node == null) {
            return
        }

        //if(node.left != null) {
            copyTreeToList(node.left, result)
        //}

        result.add(node.value)

        //if(node.right != null) {
            copyTreeToList(node.right, result)
        //}
    }

    fun validateTree2(node: TreeNode?): Boolean {
        if (node == null) return true

        if (!validateTree2(node.left)) return false

        if (lastPrinted != null && (lastPrinted!! >= node.value)) { //not sorted
            return false
        }

        lastPrinted = node.value

        if (!validateTree2(node.right)) return false

        return true
    }

    fun validateTree3(node: TreeNode?, lastFound: WrapInt): Boolean {

        if (node == null) return true

        if (!validateTree3(node.left, lastFound)) return false

        if (lastFound.value != null && (lastFound.value!! >= node.value)) { //not sorted
            return false
        }

        lastFound.value = node.value

        if (!validateTree3(node.right, lastFound)) return false

        return true
    }

    fun validateTreeV4(node: TreeNode?): Boolean {
        return validateTreeV4(node, null, null)
    }

    private fun validateTreeV4(node: TreeNode?, min: Int?, max: Int?): Boolean {
        if(node == null) return true

        if((min != null && node.value <= min) || (max != null && node.value > max)) {
            return false
        }

        if (!validateTreeV4(node.left, min, node.value) ) return false
        if(!validateTreeV4(node.right, node.value, max)) return false

        return true
    }


}