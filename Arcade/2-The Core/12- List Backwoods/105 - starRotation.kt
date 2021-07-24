fun starRotation(matrix: MutableList<MutableList<Int>>, width: Int, center: MutableList<Int>, t: Int): MutableList<MutableList<Int>> {
    val c1 = center[0]
    val c2 = center[1]

    for(i in 1..t % 8){
        for(j in 1..(width / 2)){
            val tmp = matrix[c1 - j][c2]
            matrix[c1 - j][c2] = matrix[c1 - j][c2 - j]
            matrix[c1 - j][c2 - j] = matrix[c1][c2 - j]
            matrix[c1][c2 - j] = matrix[c1 + j][c2 - j]
            matrix[c1 + j][c2 - j] = matrix[c1 + j][c2]
            matrix[c1 + j][c2] = matrix[c1 + j][c2 + j]
            matrix[c1 + j][c2 + j] = matrix[c1][c2 + j]
            matrix[c1][c2 + j] = matrix[c1 - j][c2 + j]
            matrix[c1 - j][c2 + j] = tmp
        }
    }

    return matrix
}

