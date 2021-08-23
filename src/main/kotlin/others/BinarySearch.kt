package others

object BinarySearch {
    fun search(arr: IntArray, num: Int): Int {
        if (arr.isEmpty()) return -1
        return search(arr, num, 0, arr.size - 1)
    }

    private fun search(arr: IntArray, num: Int, low: Int, high: Int): Int {
        if (low > high) return -1

        var first = low
        var last = high

        var mid = (first + last) / 2

        return if (arr[mid] == num) {
            mid
        } else if(num < arr[mid] ) {
            search(arr, num, low, mid-1)
        } else {
            search(arr, num, mid + 1, high)
        }
    }
}