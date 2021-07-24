fun rectangleRotation(a: Int, b: Int): Int {
    var r = 0
    for (x in -a - b..a + b) {
        for (y in -a - b..a + b) {
            if (2 * (x - y) * (x - y) <= a * a && 2 * (x + y) * (x + y) <= b * b)
                r++
        }
    }
    return r
}