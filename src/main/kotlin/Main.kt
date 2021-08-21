import chapter1.*
import chapter10.*
import chapter3.StackMin
import chapter4.MinimalBST
import chapter4.ValidateBST
import others.Fibonacci
import support.TransverseBST
import support.WrapInt

fun main(args: Array<String>) {
    testSparseSearch()
}

fun testSparseSearch() {
    val strings = arrayOf("at", "", "", "boo","")
    val empty = arrayOf<String>()

    val search1 = SparseSearch.findString(strings, "boo")
    val search2 = SparseSearch.findString(empty, "at")
    println(search1)
    println(search2)

}

fun testsSortedSearch() {
    val list = intArrayOf(0, 3, 4, 5, 9, 10)
    val listy = Listy(list)
    val index = SortedList.search(listy, 14)
    println(index)

}

fun testAnagram() {
    val strArr = arrayOf("cat", "cat", "vim", "tac","atc", "miv" )
    // val arr = GroupAnagrams.groupAnagram(strArr)
    val arr2 = GroupAnagrams.groupAnagramsV2(strArr)
    //println(arr.contentToString())
    println(arr2)
}

fun testSortedMerge() {
    val arrA = IntArray(7)
    arrA[0] = 2
    arrA[1] = 4
    arrA[2] = 8
    arrA[3] = 10

    println(arrA.contentToString())

    val arrB = intArrayOf(2, 9, 16)
    println(arrB.contentToString())


    val sorted = SortedMerge.merge(arrA, arrB, 4, 3)

    println(arrA.contentToString())
    println(sorted.contentToString())
}

fun testFibonacci() {
    val sequence = intArrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811)

    val n = 25
    println(Fibonacci.fib(n))
    println(Fibonacci.fibRecursive(n))
    println(Fibonacci.fibDp(n))
}

fun testIsUnique() {
    // Ch1_isUnique
    val input = "qwertyuiop@5f"
    println(IsUnique.isUniqueChars(input))
    println(IsUnique.isUniqueCharsV2(input))
}

fun testPermutation() {
    // Ch2_permutation
    val str1 = "qwgerty12"
    val str2 = "ytrewq12"

    println(CheckPermutation.isPermutationV3(str1, str2))
}

fun testUrilify() {
    // Urilify
    val str1 = "Mr Joch Smith    "
    println(Urilificator.urlify(str1, 13))
}

fun testPalindrome() {
    // Palindrome
    var str = "netet1   "
    println(Palindrome.isPermutationOfPalindromeV2(str))
}

fun testOneWay() {
    // OneWay
    val str1 = "pale"
    val str2 = "ple"
    val str3 = "pales"
    val str4 = "bale"
    val str5 = "bake"
    println(OneWay.isOneWay(str1, str2)) // true
    println(OneWay.isOneWay(str3, str1)) // true
    println(OneWay.isOneWay(str1, str4)) // true
    println(OneWay.isOneWay(str1, str5)) // false
}

fun testZeroMatrix() {
    // zero matrix
    val inputArray: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 0, 6),
        intArrayOf(7, 8, 9, 0),
        intArrayOf(1, 5, 3, 6),
        )

    val result = ZeroMatrix.getZeroMatrixV2(inputArray)

    for (row in result) {
        for (column in row) {
            print(column)
        }
        println("\n")
    }
}

fun testMinStack() {
    // Stack min
    StackMin.printStacks()
    StackMin.push(3)
    StackMin.push(5)
    StackMin.push(4)
    StackMin.push(2)
    StackMin.push(7)
    StackMin.push(2)
    StackMin.printStacks()

    println(StackMin.pop())
    println(StackMin.min())

    println(StackMin.pop())
    println(StackMin.min())

    println(StackMin.pop())
    println(StackMin.min())

    println(StackMin.pop())
    println(StackMin.min())

    println(StackMin.pop())
    println(StackMin.min())

    println(StackMin.pop())
    println(StackMin.min())
}

fun testMinBst() {
    val input = intArrayOf(1, 4, 6, 9, 15, 20, 170)
    // val input = intArrayOf(1,3)

    val tree = MinimalBST.getMinTree(input)
    println(tree)
    val traversalList = TransverseBST.traverseDFS(tree)
    println("DFS: $traversalList")

    val traversalList2 = TransverseBST.traverseBFS(tree)
    println("BFS: $traversalList2")
}

fun testIsTreeBST() {
    // val input = intArrayOf(1, 4, 6, 9, 15, 20, 170) //true
    val input = intArrayOf(1, 4, 14, 9, 15, 20, 170) //false

    val tree = MinimalBST.getMinTree(input)
    println(tree)

    // val result = ValidateBST.validateTree(tree)
    // val result = ValidateBST.validateTree2(tree)
    // val result = ValidateBST.validateTree3(tree, WrapInt())
    val result = ValidateBST.validateTreeV4(tree)

    println(result)

}

fun test() {
    val s = "Test@@String#123"

    val result = s.filter { it.isLetter() }
    println(result)
}