fun drawRectangle(canvas: MutableList<MutableList<Char>>, rectangle: MutableList<Int>): MutableList<MutableList<Char>> {
    val (c1, r1, c2, r2) = rectangle
    canvas.mapIndexed { r, row ->
        if (r == r1 || r == r2) {
            row[c1] = '*'.also { row[c2] = '*' }
            for (i in c1 + 1 until c2) {
                row[i] = '-'
            }
        } else if (r in r1 + 1 until r2) {
            row[c1] = '|'
            row[c2] = '|'
        }
    }
    return canvas
}