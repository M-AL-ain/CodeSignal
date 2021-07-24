fun commonCharacterCount(s1: String, s2: String): Int {
    var count = 0
    val list1: MutableList<Char> = s1.toMutableList()
    val list2: MutableList<Char> = s2.toMutableList()

    list1.intersect(list2).forEach { x -> count += listOf(list1.count {it == x},                list2.count {it == x}).min()!! }

    return count
}
