fun sumUpNumbers(inputString: String): Int {
    val numbers = inputString.split("""[^0-9]+""".toRegex()).toMutableList()
    return numbers.filter { it != "" }.sumBy { it.toInt() }
}
