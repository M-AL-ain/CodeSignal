fun cyclicString(s: String): Int {
    var R: Boolean
    for (i in 1 until s.length) {
        R = true
        var j = 0
        while (j + i < s.length) {
            if (s.get(j) != s.get(i + j))
                R = false
            j++
        }
        if (R) return i
    }
    return s.length


}