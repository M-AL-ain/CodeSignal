fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    val squares = mutableSetOf<List<Int>>()
    for (i in 0 until matrix.size - 1) {
        (0 until matrix[i].size - 1).mapTo(squares) {
            listOf(matrix[i][it],
                matrix[i][it + 1],
                matrix[i + 1][it],
                matrix[i + 1][it + 1])
        }
    }
    return squares.size
}