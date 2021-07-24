fun arrayConversion(inputArray: MutableList<Int>): Int {
    var arr = inputArray.toMutableList()
    var op = true
    while (arr.size > 1) {
        arr = arr.windowed(2, 2).map { if (op) it[0] + it[1] else it[0] * it[1] }.toMutableList()
        op = !op
        println(arr)
    }

    return arr[0]
}