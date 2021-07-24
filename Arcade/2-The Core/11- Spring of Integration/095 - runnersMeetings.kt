fun runnersMeetings(startPosition: MutableList<Int>, speed: MutableList<Int>): Int {
    var result = 1
    for (i in startPosition.indices) {
        for (j in i + 1 until startPosition.size) {
            val W = startPosition[j] - startPosition[i]
            val R = speed[i] - speed[j]
            if (R == 0 && W != 0) continue
            var count = 0
            for (k in startPosition.indices) {
                if (startPosition[k] * R + speed[k] * W
                    == startPosition[i] * R + speed[i] * W)
                    count++
            }
            result = if (count > result) count else result
        }
    }
    result = if (result < 2) -1 else result
    return result
}
