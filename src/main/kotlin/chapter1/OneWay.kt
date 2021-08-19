package chapter1

import kotlin.math.abs

object OneWay {
    fun isOneWay(str1: String, str2: String): Boolean {
        if(str1 == str2 ) return true
        if(abs(str1.length - str2.length) > 1) return false

        val str1FrequencyMap = hashMapOf<Char, Int>()
        val str2FrequencyMap = hashMapOf<Char, Int>()

        for (char in str1) {
            val count = str1FrequencyMap.getOrDefault(char, 0)
            str1FrequencyMap[char] = count + 1
        }

        for (char in str2) {
            val count = str2FrequencyMap.getOrDefault(char, 0)
            str2FrequencyMap[char] = count + 1
        }

        println("str1FrequencyMap: $str1FrequencyMap")
        println("str2FrequencyMap: $str2FrequencyMap")

        return if(str1.length == str2.length) {
            handleSameLenght(str1FrequencyMap, str2FrequencyMap)
        } else {
            if (str1.length > str2.length) {
                handleDifferentLenght(str1FrequencyMap, str2FrequencyMap)
            } else {
                handleDifferentLenght(str2FrequencyMap, str1FrequencyMap)
            }
        }
    }

    private fun handleSameLenght(str1Freq: HashMap<Char, Int>, str2Freq: HashMap<Char, Int>): Boolean {
        var countDiffChars = 0

        for (key in str1Freq.keys) {
            if(str1Freq[key] != str2Freq[key]) {
                countDiffChars += 1
            }
        }

        return  (countDiffChars == 0 || countDiffChars == 1)  // Same or replacement
    }


    private fun handleDifferentLenght(longStringMap: HashMap<Char, Int>, shortStringMap: HashMap<Char, Int>): Boolean {
        for (key in shortStringMap.keys) {
            if(shortStringMap[key] != longStringMap[key]) {
                return false
            }
        }

        return true  // Insert or deletion
    }
}