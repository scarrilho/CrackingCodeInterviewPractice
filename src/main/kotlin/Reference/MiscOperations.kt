package Reference

object MiscOperations {
    private val testString = "Test  me "

    fun stringOps() {
        // Replace pattern in string
        val pattern = "\\s+".toRegex()
        testString.replace(pattern, " ") // replace more than one white space with one white space

        // get substring
        val stringNoLastChar = testString.substring(0, testString.length - 1)

        // Convert string to array and back
        val charArrayTest = testString.toCharArray()
        val backToString = charArrayTest.joinToString { "" }

        // String builder
        val resultString = StringBuilder()
        resultString.append('H')
        resultString.append("ello")
        val result = resultString.toString()

        // sort string
        val sortedStr1: String = testString.toCharArray().sorted().joinToString ("" )

        // filter
        val phraseCharsOnly = testString.filter{ it.isLetter() }.lowercase()
        val phraseCharsAndDigits = testString.filter{ it.isLetterOrDigit() }.lowercase()
    }

    fun hashMapOps() {
        // Get value of hasmap or default
        val charTracker = hashMapOf<Char, Int>()
        val key1 = 'k'

        // value doesnt exist (is null), but zero is returned as default value
        var charCount = charTracker.getOrDefault(key1, 0)

        // Increase the count for key1
        charTracker[key1] = charCount + 1

    }

}