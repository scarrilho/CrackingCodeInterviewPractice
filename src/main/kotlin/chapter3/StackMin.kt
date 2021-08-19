package chapter3

object StackMin {
    private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()

    fun push(value: Int) {
        stack.addLast(value)

        if (minStack.isEmpty() || value <= minStack.last()) {
            minStack.addLast(value)
        }
    }

    fun pop(): Int? {
        val removedValue = stack.removeLastOrNull()

        if (removedValue == minStack.lastOrNull()) {
            minStack.removeLast()
        }

        if (stack.isEmpty()) {
            minStack.clear()
        }

        return removedValue
    }

    fun min(): Int? {
        return minStack.lastOrNull()
    }

    fun printStacks() {
        if(!stack.isEmpty()) {
            println("Stack: $stack")
        }

        if (!minStack.isEmpty()) {
            println("minStack: $minStack")

        }
    }

}