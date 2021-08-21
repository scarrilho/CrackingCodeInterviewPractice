package chapter10

object SortedList {

    fun search(list: Listy, num: Int): Int {
        var index = 1

        while(list.elementAt(index) != -1  && list.elementAt(index) < num) {
            index *= 2
        }

        return binarySearch(list, num, index/2, index)
    }

    fun binarySearch(list: Listy, num: Int, low: Int, high: Int): Int {
        var mid = -1
        var min = low
        var max = high

        while(min <= max) {
            mid = (min + max) / 2
            val middle = list.elementAt(mid)
            if(middle == -1 || middle > num) {
                max = mid - 1
            } else if( middle < num) {
                min = mid + 1
            } else if (middle == num) {
                return mid
            }
        }

        return -1
    }

}

class Listy(private val list: IntArray) {
    //val list = listOf<Int>(0, 3, 4, 5, 9, 10)

    fun elementAt(index: Int): Int {
        return if (index >= list.size ) {
            -1
        } else {
            list[index]
        }
    }
}