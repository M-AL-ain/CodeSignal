fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> =
    matrix.indices.map { row ->
        matrix[row].indices.map { column ->
            matrix
                .slice (maxOf(0, row - 1)..minOf(row + 1, matrix.lastIndex) )
                .flatMap { it.slice(maxOf(0, column - 1)..minOf(column + 1, matrix[row].lastIndex)) }
                .count { it } - if (matrix[row][column]) 1 else 0
        }.toMutableList()
    }.toMutableList()