package chapter2

object LoopDetection {

    fun detectLoop(head: Node): Node? {
        var slow: Node? = head
        var fast: Node? = head

        while(fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if(slow == fast) { // collision
                break
            }
        }

        if(fast?.next == null) {
            return null // no loop
        }

        slow = head

        while(slow != fast) {
            slow = slow?.next
            fast = fast?.next?.next
        }

        return slow


    }

}