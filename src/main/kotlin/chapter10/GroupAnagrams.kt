package chapter10

object GroupAnagrams {

    fun groupAnagram(arr: Array<String>): Array<String> {
        arr.sortWith(AnagramComparator())
        return arr
    }

    fun groupAnagramsV2(arr: Array<String>): List<String> {
        val anagrams = hashMapOf<String, MutableList<String>>()
        val finalList = mutableListOf<String>()

        for (word in arr) {
            val key = word.toCharArray().sorted().joinToString ("")

            println(key)

            if (anagrams[key] != null) {
                anagrams[key]?.add(word)
            } else {
                anagrams[key] = mutableListOf(word)
            }
            // anagrams[key]?.add(word)
        }

        println(anagrams)

        for (key in anagrams.keys) {
            for (word in anagrams[key]!!) {
                finalList.add(word)
            }
        }

        return finalList

    }
}

class AnagramComparator: Comparator<String> {
    override fun compare(s1: String, s2: String): Int {
        // println("s1: $s1, s2: $s2, compResult: $result")
        return sortChars(s1).compareTo(sortChars(s2))
    }

    private fun sortChars(s: String): String {
       var sorted = s.toCharArray().sorted().joinToString("")
        // println("s: $s, sorted: $sorted")
        return sorted

    }

}