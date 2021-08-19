package chapter1

object Palindrome {

    // O(n)
    fun isPermutationOfPalindrome(phrase: String): Boolean {
        val phraseChars = phrase.filter{ it.isLetter() }.lowercase()
        val frequencyTable = hashMapOf<Char, Int>()
        var countOfOddChars = 0

        //O(n)
        for(char in phraseChars) {
            var count = frequencyTable.getOrDefault(char, 0)
            frequencyTable[char] = count + 1
        }

        print("Chars only string: $phraseChars \n")
        print("Hashtable: $frequencyTable \n")

        for(value in frequencyTable.values) {
            if(value %2 == 1) {
                countOfOddChars += 1
            }
        }

        return countOfOddChars <= 1
    }

    // O(n)
    fun isPermutationOfPalindromeV2(phrase: String): Boolean {
        val phraseChars = phrase.filter{ it.isLetter() }.lowercase()
        val frequencyTable = hashMapOf<Char, Int>()
        var countOfOddChars = 0

        //O(n)
        for(char in phraseChars) {
            var count = frequencyTable.getOrDefault(char, 0)
            val newCount = count + 1
            frequencyTable[char] = newCount

            if (newCount % 2 == 1) {
                countOfOddChars +=1
            } else {
                countOfOddChars -=1
            }
        }

        print("Chars only string: $phraseChars \n")
        print("Hashtable: $frequencyTable \n")

        return countOfOddChars <= 1
    }

}