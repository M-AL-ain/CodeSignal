fun matrixElementsSum(matrix: MutableList<MutableList<Int>>) = matrix.last()
    .indices
    .map{c->matrix.indices.map{matrix[it][c]}.takeWhile{it>0}.sum()}.sum()

