fun arrayPreviousLess(items: MutableList<Int>) = items.mapIndexed { index, i ->
    items.subList(0, index).lastOrNull { it < i } ?: -1
}