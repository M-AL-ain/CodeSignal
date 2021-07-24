fun weakNumbers(n: Int): MutableList<Int> {
    val map = HashMap<Int, Int>()
    val wmap = HashMap<Int, Int>()
    var a = 0
    for (i in 1..n) {
        var k = 0
        for (j in 2 until i)
            if (i % j == 0)
                k++
        map[i] = k
        var cur = map.values.filter { it > k }.count()
        wmap[i] = cur
        if (cur > a)
            a = cur
    }
    var b = wmap.values.filter { it == a }.count()
    return mutableListOf(a, b)
}
