package chapter2

object Palindrome {
    fun isPalindrome(head: Node?): Boolean {
        if(head == null) {
                return false
            }

        val reversed: Node? = reverse(head)
        return compare(head, reversed)
    }

    private fun reverse(node: Node?): Node? {
        var head: Node? = null
        var current = node

        while(current != null) {
            val new = Node(value = current.value)
            new.next = head
            head = new

            current = current.next
        }

        return head
    }

    private fun compare(nodeOne: Node?, nodeTwo: Node?): Boolean {

        var one = nodeOne
        var two = nodeTwo

        if (one == null || two == null) {
            return false
        }

        while (one?.next != null && two?.next != null) {
            if(one.value != two.value) {
                return false
            }

            one = one.next
            two = two.next
        }

        return one == null && two == null
    }


}