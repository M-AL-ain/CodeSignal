fun contoursShifting(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val s = Math.max(matrix.size, matrix[0].size)
    for (i in 0..s / 2) {

        shiftContour(matrix, i)
    }
    return matrix
}

fun shiftContour(matrix: MutableList<MutableList<Int>>, contour: Int) {
    val rowSize = matrix[0].size - 2 * contour
    val colSize = matrix.size - 2 * contour
    if (rowSize <= 0 || colSize <= 0) return
    println("$rowSize $colSize")

    if (rowSize == 1) {
        var last = -1
        if (contour % 2 == 0) {
            for (i in contour until matrix.size - contour) {
                val tmp = matrix[i][contour]
                matrix[i][contour] = last
                last = tmp
            }
            matrix[contour][contour] = last
        } else {
            for (i in matrix.size - contour - 1 downTo contour) {
                val tmp = matrix[i][contour]
                matrix[i][contour] = last
                last = tmp
            }
            matrix[matrix.size - contour - 1][contour] = last
        }
        return
    }
    if (colSize == 1) {
        var last = -1
        if(contour % 2 ==0) {
            for (i in contour until matrix[0].size - contour) {
                val tmp = matrix[contour][i]
                matrix[contour][i] = last
                last = tmp
            }
            matrix[contour][contour] = last
        }
        else{
            for (i in  matrix[0].size - contour -1 downTo   contour) {
                val tmp = matrix[contour][i]
                matrix[contour][i] = last
                last = tmp
            }
            matrix[contour][matrix[0].size - contour -1] = last
        }
        return
    }
    if (contour % 2 == 0) {
        var last = -1
        for (i in contour until matrix[0].size - contour) {
            val tmp = matrix[contour][i]
            matrix[contour][i] = last
            last = tmp
        }
        for (i in contour + 1 until matrix.size - contour) {
            val tmp = matrix[i][matrix[0].size - 1 - contour]
            matrix[i][matrix[0].size - 1 - contour] = last
            last = tmp
        }

        for (i in matrix[0].size - 2 - contour downTo contour) {
            val tmp = matrix[matrix.size - 1 - contour][i]
            matrix[matrix.size - 1 - contour][i] = last
            last = tmp
        }

        for (i in matrix.size - 2 - contour downTo contour) {
            val tmp = matrix[i][contour]
            matrix[i][contour] = last
            last = tmp
        }

    } else {
        var last = -1
        for (i in matrix[0].size - 1 - contour downTo contour) {
            val tmp = matrix[contour][i]
            matrix[contour][i] = last
            last = tmp
        }
        for (i in contour + 1 until matrix.size - contour) {
            val tmp = matrix[i][contour]
            matrix[i][contour] = last
            last = tmp
        }
        for (i in contour + 1 until matrix[0].size - contour) {
            val tmp = matrix[matrix.size - 1 - contour][i]
            matrix[matrix.size - 1 - contour][i] = last
            last = tmp
        }
        for (i in matrix.size - 2 - contour downTo contour) {
            val tmp = matrix[i][matrix[0].size - 1 - contour]
            matrix[i][matrix[0].size - 1 - contour] = last
            last = tmp
        }
    }
}
