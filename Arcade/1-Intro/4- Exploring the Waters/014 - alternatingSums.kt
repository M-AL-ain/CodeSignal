fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var teams = mutableListOf<Int>(0, 0)
    for (i in 0 until a.size) {
        if (i % 2 == 0) {
            teams[0] += a[i]
        } else {
            teams[1] += a[i]
        }
    }
    return teams

}