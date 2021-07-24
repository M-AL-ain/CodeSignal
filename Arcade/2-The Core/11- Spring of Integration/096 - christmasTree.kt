fun christmasTree(levelNum: Int, levelHeight: Int): MutableList<String> {
    val width = 5 + 2 * (levelHeight - 1) + 2 * (levelNum - 1)
    val crown = listOf(getLine(width, 1), getLine(width, 1), getLine(width, 3))
    val body = (0 until levelNum).flatMap {
        (0 until levelHeight).map { i -> getLine(width, 5 + it * 2 + i * 2) }
    }
    val foot = (0 until levelNum).map {
        getLine(width, if (levelHeight % 2 == 0) levelHeight + 1 else levelHeight)
    }
    return (crown + body + foot).toMutableList()
}

fun getLine(width: Int, size: Int): String {
    val margin = (width - size) / 2
    return "${" ".repeat(margin)}${"*".repeat(size)}"
}