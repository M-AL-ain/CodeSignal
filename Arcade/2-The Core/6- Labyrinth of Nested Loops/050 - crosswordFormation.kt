fun crosswordFormation(words: MutableList<String>): Int {
    var result = 0
    for (p in permutations(words.map { it.toCharArray() }))
        result += formationCount(p, 0, listOf())
    return result
}

fun formationCount(words: List<CharArray>, index: Int, crosses: List<Pair<Int, Int>>): Int {
    if (index == 3) {
        return if (isValid(words, crosses)) 1 else 0
    }
    var result = 0
    val word = words[index]
    var nextWord = words[index + 1]
    val startIndex = if (index > 0) crosses[index - 1].second + 2 else 0
    for (i in startIndex until word.size) {
        val c = word[i]
        for (j in 0 until nextWord.size) {
            if (c != nextWord[j])
                continue
            result += formationCount(words, index + 1, crosses + Pair(i, j))
        }
    }
    return result
}

fun <T> permutations(list: List<T>): List<List<T>> {
    if (list.isEmpty())
        return listOf()
    if (list.size == 1)
        return listOf(list)
    val result: MutableList<List<T>> = mutableListOf()
    for (i in list.indices) {
        val item = list[i]
        for (permutation in permutations(list.subList(0, i) + list.subList(i + 1, list.size)))
            result.add(listOf(item) + permutation)
    }
    return result
}

fun isValid(words: List<CharArray>, crosses: List<Pair<Int, Int>>): Boolean {

    val h = crosses[1].first - crosses[0].second
    val diff = crosses[1].second - crosses[0].first

    if (crosses[2].second - h < 0 || crosses[2].first - diff >= words[0].size)
        return false

    return words[0][crosses[2].first - diff] == words[3][crosses[2].second - h]
            && words[2][crosses[2].first] == words[3][crosses[2].second]
}