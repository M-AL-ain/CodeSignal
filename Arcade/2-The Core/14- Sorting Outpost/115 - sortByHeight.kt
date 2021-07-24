fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    for (i in 0 until a.size) {
        for (j in i until a.size) {
            if (a[i] == -1 || a[j] == -1) {
                continue
            } else if (a[i] > a[j]) {
                val temp = a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }

    return a
}
