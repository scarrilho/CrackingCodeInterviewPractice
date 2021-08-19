import chapter1.*
import chapter3.StackMin

fun main(args: Array<String>) {
    // println("Hello World!")

    // Try adding program arguments at Run/Debug configuration

    // Ch1_isUnique
    // val input = "qwertyuiop@5f"
    // println(IsUnique.isUniqueChars(input))
    // println(IsUnique.isUniqueCharsV2(input))

    // Ch2_permutation
    // val str1 = "qwgerty12"
    // val str2 = "ytrewq12"

    // println(CheckPermutation.isPermutationV3(str1, str2))

    // Urilify
    // val str1 = "Mr Joch Smith    "
    // println(Urilificator.urlify(str1, 13))

    // Palindrome
    // var str = "netet1   "
    // println(Palindrome.isPermutationOfPalindromeV2(str))

    // OneWay
    /*
    val str1 = "pale"
    val str2 = "ple"
    val str3 = "pales"
    val str4 = "bale"
    val str5 = "bake"
    println(OneWay.isOneWay(str1, str2)) // true
    println(OneWay.isOneWay(str3, str1)) // true
    println(OneWay.isOneWay(str1, str4)) // true
    println(OneWay.isOneWay(str1, str5)) // false
*/

    // zero matrix
    /*val inputArray: Array<IntArray> = arrayOf(
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
    */


    testMinStack()
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

fun test() {
    val s = "Test@@String#123"

    val result = s.filter { it.isLetter() }
    println(result)
}