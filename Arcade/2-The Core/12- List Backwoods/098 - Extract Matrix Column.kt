fun extractMatrixColumn(matrix: MutableList<MutableList<Int>>, column: Int): MutableList<Int> {
    return matrix.map { it[column] }.toMutableList()
}
