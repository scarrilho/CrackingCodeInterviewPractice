package leetcode

object ValidParenthesis {
    class Solution {
        fun isValid(s: String): Boolean {
            val stack = ArrayDeque<Char>()
            val strArr = s.toCharArray()

            for(char in strArr) {
                when (char) {
                    '(', '{','['  -> stack.addLast(char)
                }

                if (char == ')' && (stack.removeLast() != '(')) return false
                if (char == '}' && (stack.removeLast() != '{')) return false
                if (char == ']' && (stack.removeLast() != '[')) return false
            }

            return true
        }
    }
}