fun rowsRearranging(matrix: MutableList<MutableList<Int>>): Boolean {
    matrix.sortBy { it[0] }
    return (1..matrix.lastIndex).all {
        matrix[it].indices.all { i -> matrix[it][i] > matrix[it - 1][i]}
    }
}