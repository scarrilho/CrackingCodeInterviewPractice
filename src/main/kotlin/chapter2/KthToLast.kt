package chapter2

class KthToLast {
    fun printKtoLast(head: Node?, k: Int): Int {
        if (head == null) {
            return 0
        }

        var index = printKtoLast(head.next, k) + 1

        if(index == k) {
            println("Data in Kth node from last is ${head.value}")
        }

        return index

    }



    fun getKthToLast(head: Node?, k: Int): Node? {
        val index = Index()
        return getKthToLast(head, k, index)

    }

    fun getKthToLast(head: Node?, k: Int, idx: Index): Node? {
        if(head == null) {
            return null
        }

        val node = getKthToLast(head, k, idx)
        idx.value += 1

        if(k == idx.value) {
            return head
        }

        return node
    }
}

class Index {
    var value = 0
}