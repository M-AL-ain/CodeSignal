fun extractEachKth(inputArray: MutableList<Int>, k: Int): List<Int> {
    return inputArray.filterIndexed { i, _ ->
        (i + 1) % k != 0
    }
}