fun mirrorBits(a: Int): Int {
    var x = String.format(
        "%" + 2 + "s",
        Integer.toBinaryString(a)
    ).replace(" ".toRegex(), "0").reversed().toLong()

    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (x.toInt() != 0) {
        remainder = x.toLong() % 10
        x/= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}
