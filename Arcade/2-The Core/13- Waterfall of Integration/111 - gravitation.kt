fun gravitation(rows: MutableList<String>): MutableList<Int> {
    val timeForEachCol = rows[0].indices.map { j -> rows.indices.map { i -> rows[i][j] }.dropWhile { it == '.' }.count { it == '.' } }
    val minCol = timeForEachCol.min() ?: 0
    return timeForEachCol.withIndex().filter { it.value == minCol }.map { it.index }.toMutableList()
}
