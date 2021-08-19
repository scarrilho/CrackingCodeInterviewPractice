package chapter1

object CheckPermutation {
    fun isPermutation(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) {
            return false
        }

        val charTracker = hashMapOf<Char, Int>()

        for(char in str1) {
            var charCount = charTracker.getOrDefault(char, 0)
            charCount += 1
            charTracker[char] = charCount
        }

        print("Start check second string \n")

        for(char in str2) {
            var charCount = charTracker.getOrDefault(char, 0)
            charCount -= 1
            charTracker[char] = charCount
            print("char: $char, charCount: $charCount \n")

            if(charCount < 0) {
                return false
            }
        }

        return true
    }


    fun isPermutationV2(str1: String, str2: String): Boolean {
        val sortedStr1 = str1.toSortedSet()
        val sortedStr2 = str2.toSortedSet()
        print("sortedStr1: $sortedStr1, sortedStr2: $sortedStr2 \n")

        return sortedStr1 == sortedStr2
    }

    fun isPermutationV3(str1: String, str2: String): Boolean {
        val sortedStr1: String = str1.toCharArray().sorted().joinToString ("" )
        val sortedStr2: String = str2.toCharArray().sorted().joinToString ("" )

        print("sortedStr1: $sortedStr1, sortedStr2: $sortedStr2 \n")

        return sortedStr1 == sortedStr2
    }
}