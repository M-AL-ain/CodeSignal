fun mostFrequentDigitSum(n: Int): Int {
    val s = { i: Int ->
        generateSequence(i) { it / 10 }
            .takeWhile { it > 0 }
            .map { it % 10 }
            .sum()
    }
    val countMap = generateSequence(n) { it - s(it) }
        .takeWhile { it > 0 }
        .groupingBy { s(it) }
        .eachCount()
    val max = countMap.map { it.value }.max() ?: 0
    return countMap.filter { (_, v) -> v == max }.map { it.key }.max() ?: 0
}
