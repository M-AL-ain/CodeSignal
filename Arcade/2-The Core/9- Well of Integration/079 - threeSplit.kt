fun threeSplit(a: MutableList<Int>): Int {
    val s = a.map { it.toDouble() }.sum() / 3
    var c = 0
    var s1 = 0.0
    (0 until (a.size - 1)).forEach { i ->
        s1 += a[i]
        if (s1 == s) {
            var s2 = 0.0
            ((i + 1) until (a.size - 1)).forEach { j ->
                s2 += a[j]
                if (s2 == s) {
                    c++
                }
            }
        }
    }
    return c
}

