fun stringsCrossover(inputArray: MutableList<String>, result: String): Int {
    return inputArray.indices.flatMap { inputArray.subList(it + 1, inputArray.size).map { i -> Pair(inputArray[it], i) } }
        .map { if (isValidCrossover(it, result)) 1 else 0 }
        .sum()
}

fun isValidCrossover(pair: Pair<String, String>, result: String): Boolean {
    return (0 until result.length).none { pair.first[it] != result[it] && pair.second[it] != result[it] }
}
