fun createArray(size: Int): MutableList<Int> {
    val list = mutableListOf<Int>(size)
    for (i in 1..size) {
        list[i]=1
    }
    return list.toMutableList()
}
