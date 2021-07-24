fun reverseOnDiagonals(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val lastIdx = matrix.lastIndex
    for (i in 0..lastIdx / 2) {
        matrix[i][i] = matrix[lastIdx - i][lastIdx - i].also {
            matrix[lastIdx - i][lastIdx - i] = matrix[i][i]
        }
        matrix[i][lastIdx - i] = matrix[lastIdx - i][i].also {
            matrix[lastIdx - i][i] = matrix[i][lastIdx - i]
        }
    }
    return matrix
}