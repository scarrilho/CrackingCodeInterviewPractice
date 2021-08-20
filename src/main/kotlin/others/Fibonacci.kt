package others

object Fibonacci {

    // Fibonacci loop: O(n)
    fun fib(n: Int): Int {
        var old = 0
        var prev = 1
        var index = 2

        if(n == 0 || n == 1) {
            return n
        }

        while(index <= n) {
            var temp = prev
            prev += old
            old = temp
            index += 1
        }

        return prev
    }

    // Fibonacci recursive O(2^n)
    fun fibRecursive(n: Int): Int {
        if(n == 0 || n == 1) {
            return n
        }

        return fibRecursive(n-1) + fibRecursive(n-2)
    }

    // Fibonacci DP O(n)
    fun fibDp(n: Int): Int {
        return fibDp(n, IntArray(n+1))
    }

    private fun fibDp(n: Int, mem: IntArray): Int {
        if(n == 0 || n == 1) {
            return n
        }

        if(mem[n] == 0) {
            mem[n] =  fibDp(n-1, mem) + fibDp(n-2, mem)
        }

        return mem[n]
    }


}