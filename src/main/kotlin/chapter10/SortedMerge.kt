package chapter10

object SortedMerge {

    fun merge(arrA: IntArray, arrB: IntArray, countA: Int, countB: Int): IntArray {
        var indexA = countA - 1
        var indexB =  countB - 1
        var indexM = (countA + countB) -1

        while(indexB >= 0) {
            if(indexA >= 0 && arrA[indexA] > arrB[indexB]) {
                arrA[indexM] = arrA[indexA]
                indexA -= 1
            } else {
                arrA[indexM] = arrB[indexB]
                indexB -= 1
            }
            indexM -= 1

        }

        return arrA
    }
}