fun boxesPacking(length: MutableList<Int>, width: MutableList<Int>, height: MutableList<Int>): Boolean {
    val boxes = (0 until length.size)
        .map { listOf(length[it], width[it], height[it]).sorted() }
        .sortedBy { it[0].toDouble() * it[1] * it[2] }

    return (1 until boxes.size).all { i -> (0..2).all { boxes[i - 1][it] < boxes[i][it] } }
}