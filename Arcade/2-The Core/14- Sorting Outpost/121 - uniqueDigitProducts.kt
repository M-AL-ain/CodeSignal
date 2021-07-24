fun uniqueDigitProducts(a: MutableList<Int>): Int {
    return a.map { it.toString().fold(1) { acc, e -> acc * (e - '0') } }.toSet().size
}
