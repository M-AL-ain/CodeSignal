fun replaceMiddle(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size % 2 == 1) return arr

    val middleSum = arr[(arr.size/2) -1] + arr[arr.size/2]

    arr[(arr.size/2) -1] = middleSum
    arr.removeAt(arr.size/2)

    return arr
}
