fun beautifulText(inputString: String, l: Int, r: Int): Boolean {
    val len = inputString.length
    for (width in l..r) {
        for (i in width..len step width + 1) {
            if (i == len) return true
            if (!inputString[i].isWhitespace()) break
        }
    }
    return false
}
