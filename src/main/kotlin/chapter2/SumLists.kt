package chapter2

object SumLists {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return addTwoNumbers(l1, l2, 0)

    }

    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int): ListNode? {
        if(l1 == null && l2 == null && carry == 0){
            return null
        }

        var value = carry

        if(l1 != null) {
            value += l1.value
        }

        if(l2 != null) {
            value += l2.value
        }

        val digitSum = value % 10

        var result = ListNode(digitSum)

        if(l1 != null || l2 != null) {
            var nextNode = addTwoNumbers(l1?.next, l2?.next, if (value > 10) 1 else 0)

            result.next = nextNode
        }

        return result
    }

    fun addTwoNumberV2(lnode1: ListNode?, lnode2: ListNode?): ListNode? {
        var root: ListNode? = null
        var current: ListNode? = null
        var carry = 0

        var l1 = lnode1
        var l2 = lnode2

        while (l1 != null || l2 != null || carry > 0) {
            var tempSum = carry

            if (l1 != null) {
                tempSum += l1.value
            }

            if (l2 != null) {
                tempSum += l2.value
            }

            carry = if(tempSum >= 10) 1 else 0


            var result = ListNode(tempSum % 10)

            if (root == null) {
                root = result
                current = result
            } else {
                current?.next = result
                current = result
            }

            l1 = l1?.next
            l2 = l2?.next
        }

        return root
    }
}