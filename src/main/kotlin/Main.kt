fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val charCountMap = countCharacters(input)

    println("Количество различных символов:")
    for ((char, count) in charCountMap) {
        println("$char - $count")
    }
}

fun countCharacters(input: String): Map<Char, Int> {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        val uppercaseChar = char.toUpperCase()
        if (uppercaseChar.isLetter()) {
            charCountMap[uppercaseChar] = charCountMap.getOrDefault(uppercaseChar, 0) + 1
        }
    }

    return charCountMap.toSortedMap()
}
