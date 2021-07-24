fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>): MutableList<Int> {
    a.addAll(b)
    return a
}
