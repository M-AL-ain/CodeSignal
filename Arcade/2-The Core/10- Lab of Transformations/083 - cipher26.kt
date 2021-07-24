fun cipher26(message: String): String {
    val result = StringBuilder()
    var x = 0
    var y = 0

    for (i in 0 until message.length) {
        val t = message.toCharArray()[i].toInt() - 97
        x = t - y
        if (x < 0)
            x += 26
        result.append((x + 97).toChar())
        y = t
    }

    return result.toString()
}
