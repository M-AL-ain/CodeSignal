fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if (weight1 + weight2 <= maxW) return value1 + value2

    var max = 0
    if (weight1 <= maxW) {
        max = value1
    }
    if (weight2 <= maxW
        &&  value2 > max) {
        max = value2
    }
    return max
}