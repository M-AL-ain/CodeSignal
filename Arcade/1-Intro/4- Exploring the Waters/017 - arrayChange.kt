fun arrayChange(inputArray: MutableList<Int>): Int {
    val arrayLenght: Int = inputArray.size

    var steps = 0

    for (i in 1 until arrayLenght) {
        if (inputArray[i] <= inputArray[i - 1]) {
            val diff = inputArray[i - 1] - inputArray[i] + 1
            steps += diff
            inputArray[i] += diff
        }
    }

    return steps
}