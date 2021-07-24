fun firstReverseTry(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size > 1) {
        val temp = arr[0]
        arr[0] = arr[arr.size - 1]
        arr[arr.size - 1] = temp
    }
    return arr
}
