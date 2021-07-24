fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var max = 0
    val arrayLength: Int = inputArray.size

    for (i in 0 until arrayLength - 1) {
        if (Math.abs(inputArray[i] - inputArray[i + 1]) > max) max = Math.abs(inputArray[i] - inputArray[i + 1])
    }

    return max
}
