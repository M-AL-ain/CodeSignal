fun longestDigitsPrefix(inputString: String): String {
    return  inputString.takeWhile { it.isDigit() }
}
