val tokenRegex = Regex("""[a-z]|\d+""")
val leadingZeroesRegex = Regex("^0+")
fun alphanumericLess(s1: String, s2: String): Boolean {
    val tokens1 = tokenRegex.findAll(s1).map(MatchResult::value).toList()
    val tokens2 = tokenRegex.findAll(s2).map(MatchResult::value).toList()
    val zippedTokens = tokens1 zip tokens2

    for ((tok1, tok2) in zippedTokens) {
        when (compareTokens(tok1, tok2)) {
            -1 -> return true
            1 -> return false
        }
    }

    for ((tok1, tok2) in zippedTokens) {
        val zeroes1 = leadingZeroesRegex.find(tok1)?.value?.length ?: 0
        val zeroes2 = leadingZeroesRegex.find(tok2)?.value?.length ?: 0
        if (zeroes1 != zeroes2) {
            if (zeroes1 > zeroes2) return true

            break
        }
    }

    return tokens1.size < tokens2.size
}

fun compareTokens(tok1: String, tok2: String) = when (tok1[0].isDigit() to tok2[0].isDigit()) {
    true to true -> tok1.toBigInteger().compareTo(tok2.toBigInteger())
    true to false -> -1
    false to true -> 1
    false to false -> tok1[0].compareTo(tok2[0])
    else -> throw AssertionError("We've reinvented booleans!")
}
