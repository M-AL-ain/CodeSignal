fun rangeBitCount(a: Int, b: Int): Int {
    var BitCount = 0
    for (i in a..b) {
        var tarray = i
        while (tarray > 0) {
            BitCount += tarray and 1
            tarray = tarray shr 1
        }
    }
    return BitCount
}
