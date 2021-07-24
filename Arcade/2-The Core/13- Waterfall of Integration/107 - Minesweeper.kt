fun minesweeper(matrix: MutableList<MutableList<Boolean>>): Any? {
    return matrix.mapIndexed { i, r ->
        r.mapIndexed { j, e ->
            (-1..1).sumBy{ dy->
                (-1..1).count { dx ->
                    i + dy in matrix.indices && j + dx in matrix[0].indices && matrix[i+dy][j+dx]
                }
            } - (if (e) 1 else 0)
        }
    }
}
