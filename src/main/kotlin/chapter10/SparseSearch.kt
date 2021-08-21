package chapter10

object SparseSearch {
    fun findString(strings: Array<String>, str: String): Int {
        if(strings.isEmpty() || str.isEmpty()) {
            return -1
        }

        return findString(strings, str, 0, strings.size-1)
    }

    private fun  findString(strings: Array<String>, str: String, first: Int, last: Int): Int {
        if(first > last) return -1

        var mid = (first + last)/2

        if(strings[mid].isEmpty()) {
            var left = mid - 1
            var right = mid + 1

            while(true) {
                if(left < first && right > last) return -1

                if(left >= first && strings[left].isNotEmpty()) {
                    mid = left
                    break
                } else if(right <= last && strings[right].isNotEmpty()) {
                    mid = right
                    break
                }
                right++
                left--
            }
        }

        return if(str == strings[mid]){
            mid
        } else if(str < strings[mid]) {
            findString(strings, str, first, mid-1)
        } else {
            findString(strings, str, mid + 1, last)
        }
    }

}