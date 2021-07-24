fun maximumSum(a: MutableList<Int>, q: MutableList<MutableList<Int>>): Int {
    val frequency = MutableList(a.size) { 0 }
    q.map { (it[0]..it[1]).map { index -> frequency[index] += 1 } }
    a.sort()
    frequency.sort()
    var i = 0
    return a.sumBy { it * frequency[i++] }
}
