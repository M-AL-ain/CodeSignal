fun spiralNumbers(n: Int): MutableList<MutableList<Int>> {
    val matrix = MutableList(n) { MutableList(n) { 0 } }
    var currNum = 1
    var depth = 0
    while (depth < n) {

        ((0 + depth)until(n-depth)).map { matrix[depth][it] = currNum++ }
        ((1+depth) until (n-depth)).map { matrix[it][n-depth-1] = currNum++ }
        ((n-depth-2) downTo (0+depth)).map { matrix[n-depth-1][it] = currNum++ }
        ((n-depth-2) downTo (0+depth+1)).map { matrix[it][depth] = currNum++ }
        depth++
    }
    return matrix
}
