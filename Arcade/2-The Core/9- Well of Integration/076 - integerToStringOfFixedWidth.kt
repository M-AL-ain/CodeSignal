fun integerToStringOfFixedWidth(number: Int, width: Int): String {
    val s = number.toString()
    if (s.length > width) {
        return s.substring(s.length - width)
    } else {
        return s.padStart(width, '0')
    }
}
