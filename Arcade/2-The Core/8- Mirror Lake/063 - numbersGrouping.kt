fun numbersGrouping(a: MutableList<Int>): Int {
    var count = 1
    var tempList : MutableList<Int> = mutableListOf()
    for (i in 0 until a.size) {
        tempList.add((a[i] - 1) / 10000)
    }
    tempList.sort()
    for (j in 1 until tempList.size) {
        if (tempList[j] != tempList[j - 1]) {
            count ++
        }
    }
    return count + a.size
}
