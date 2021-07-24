fun arrayPacking(a: MutableList<Int>): Int {
    var sum = 0
    for (i in 0 until a.size) {
        sum += a[i] shl i * 8
    }

    return sum
}
