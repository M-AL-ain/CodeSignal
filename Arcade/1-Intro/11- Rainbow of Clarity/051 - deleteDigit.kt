fun deleteDigit(n: Int): Int {
    val str = n.toString()
    return (0 until n.toString().length).map { i ->
        str.filterIndexed { idx, _ -> idx != i }.toInt()
    }.max()!!

}