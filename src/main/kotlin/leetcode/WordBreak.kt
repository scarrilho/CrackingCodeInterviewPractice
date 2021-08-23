package leetcode

class WordBreak {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val sArr = s.toCharArray()
        val temp = StringBuilder()

        val dict = wordDict.toHashSet()

        for(char in sArr) {
            temp.append(char)

            if(dict.contains(temp.toString())) {
                temp.setLength(0)
            }
        }

        return temp.isEmpty()
    }
}