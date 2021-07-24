fun digitDifferenceSort(a: MutableList<Int>): List<Int> {
    return a.withIndex().sortedWith(compareBy({ it.value.toString().run { max()!! - min()!! } }, { -it.index })).map { it.value }
}
