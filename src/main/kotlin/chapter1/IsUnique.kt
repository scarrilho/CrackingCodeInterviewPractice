package chapter1

const val ENCODING = 256

object IsUnique {
    fun isUniqueChars(inputString: String): Boolean {

        val inputArray = inputString.toCharArray()
        val foundChars = hashSetOf<Char>()

        for(char in inputArray) { // O(n)
            if(foundChars.contains(char)) { // O(1)
                return false
            } else {
                foundChars.add(char)  // O(1)
            }
        }
        return true
    }

// O(n^2)
    fun isUniqueCharsV2(str: String): Boolean {
        for(i in str.indices) {
            for(j in i+1 until str.length) {
                if(str[i] == str[j]) {
                    return false
                }
            }
        }

        return true
    }


    // Working with
    fun isUniqueCharsV4(inputString: String): Boolean {
        if(inputString.length > ENCODING) {
            return false
        }

        val charSet = BooleanArray(ENCODING)

        for(i in 0..inputString.length) { // O(n)
            val character = inputString[i]
            println("character : $character")

            val strCode: Int = Character.getNumericValue(character) // Unicode

            println("strCode : $strCode")

            if(charSet[strCode]) {
                // Already found this value
                return false
            }
            charSet[strCode] = true

        }
        return true
    }


}