fun timedReading(maxLength: Int, text: String): Int {
    val txt = text.filter { it.isLetter() || it == ' ' }
    val list = txt.split(" ").filter { it.length <= maxLength }
    if (list.isEmpty() || list.get(0).length == 0) return 0
    return list.size

}
