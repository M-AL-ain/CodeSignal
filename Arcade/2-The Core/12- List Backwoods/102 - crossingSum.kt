fun crossingSum(matrix: MutableList<MutableList<Int>>, a: Int, b: Int): Int {
    val rowSum = matrix[a].sum()
    val colSum = matrix.sumBy { it[b] }
    return rowSum + colSum -matrix[a][b]
}
