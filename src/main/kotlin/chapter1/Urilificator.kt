package chapter1

object Urilificator {
    fun urlify(str: String, size: Int): String? {
        val pattern = "\\s+".toRegex()

        var simpleStr = str.replace(pattern, " ")
        if (simpleStr.last() == ' ') {
            simpleStr = simpleStr.substring(0, simpleStr.length - 1)
        }

        if (simpleStr.length != size) {
            println("String without spaces length diff from passed size: ${simpleStr.length}, size= $size")
            return null
        }

        val resultString = StringBuilder()
        val wsReplacement = "%20"

        for (i in simpleStr.indices) {
            if (simpleStr[i] == ' ') {
                resultString.append(wsReplacement)
            } else {
                resultString.append(simpleStr[i])
            }
        }

        return resultString.toString()
    }
}