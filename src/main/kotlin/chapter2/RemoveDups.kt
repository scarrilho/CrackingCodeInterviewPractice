package chapter2

class RemoveDups {
    fun removeDuplicates(head: Node) {
        var foundVals = hashSetOf<Int>()

        var previous: Node? = null
        var current: Node? = head

        while(current != null) {
            if(foundVals.contains(current.value)) {
                previous?.next = current.next
            } else {
                foundVals.add(current.value)
                previous = current
            }
            current = current.next
        }
    }

    fun removeDuplicatesV2(head: Node) {
        var current: Node? = head

        while(current != null) {
            var runner: Node?  = current

            while(runner?.next != null) {
                if(runner.next?.value == current.value) {
                    runner.next = runner.next?.next
                } else {
                    runner = runner.next
                }
            }

            current = current.next
        }
    }

}


