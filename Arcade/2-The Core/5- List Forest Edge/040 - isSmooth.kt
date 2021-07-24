fun isSmooth(arr: MutableList<Int>): Boolean {
    val mid = if (arr.size % 2 == 0) {
        arr[arr.size / 2] + arr[arr.size / 2 - 1]
    } else {
        arr[arr.size / 2]
    }
    return arr.first() == mid && mid == arr.last()

}
