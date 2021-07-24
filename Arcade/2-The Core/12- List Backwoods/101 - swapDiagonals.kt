fun swapDiagonals(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val lastIdx = matrix.lastIndex
    for (i in 0..lastIdx) {
        matrix[i][i] = matrix[i][lastIdx - i].also { matrix[i][lastIdx - i] = matrix[i][i] }
    }
    return matrix
}