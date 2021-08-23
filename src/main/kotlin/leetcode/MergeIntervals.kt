package leetcode

object MergeIntervals {

    class Solution {
        fun merge(intervals: Array<IntArray>): Array<IntArray> {
            // check input

            val result = mutableListOf<IntArray>()

            var temp= intArrayOf(intervals[0][0], intervals[0][1])

            for(index in 1 until intervals.size) {
                val first = intervals[index][0]
                val last = intervals[index][1]
                val tempMin = temp[0]
                val tempMax = temp[1]

                if(first <= tempMax && tempMax < last) {
                    temp = intArrayOf(tempMin, last)
                } else {
                    result.add(temp)
                    temp = intArrayOf(first, last)
                }
            }

            result.add(temp)

            return result.toTypedArray()
        }
    }
}