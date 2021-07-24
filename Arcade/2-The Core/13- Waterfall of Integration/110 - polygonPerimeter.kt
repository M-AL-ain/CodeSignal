fun polygonPerimeter(matrix: MutableList<MutableList<Boolean>>): Int {
    var count = 0
    matrix.mapIndexed { r, list ->
        list.mapIndexed { c, value ->
            if (value) {
                (-1..1).map { dx ->
                    (-1..1).map { dy ->
                        if (Math.abs(dx) != Math.abs(dy)) {
                            try {
                                count += if (!matrix[r + dx][c + dy]) 1 else 0
                            } catch (e: IndexOutOfBoundsException) {
                                count++
                            }
                        }
                    }
                }
            }
        }
    }
    return count
}
