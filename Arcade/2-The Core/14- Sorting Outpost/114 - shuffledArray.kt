fun shuffledArray(shuffled: MutableList<Int>): MutableList<Int> {
    for (i in 0 until shuffled.size) {
        val temp = shuffled[i]
        shuffled[i] = 0

        if (temp == shuffled.sum()) {
            shuffled.removeAt(i)
            break
        } else {
            shuffled[i] = temp
        }
    }

    return shuffled.map { it }.sorted().toMutableList()
}