fun houseNumbersSum(inputArray: MutableList<Int>): Int {
    var sum = 0
    var counter = 0

    while (inputArray[counter] != 0) {
        sum += inputArray[counter]
        counter += 1
    }

    return sum
}