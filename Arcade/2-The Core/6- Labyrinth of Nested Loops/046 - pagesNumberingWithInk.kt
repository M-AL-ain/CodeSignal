fun pagesNumberingWithInk(current: Int, numberOfDigits: Int): Int {
    var current = current
    var numberOfDigits = numberOfDigits
    do {
        val currentLength = "$current".length
        numberOfDigits -= currentLength
        current += 1
    } while (numberOfDigits >= currentLength)

    return current - 1
}
