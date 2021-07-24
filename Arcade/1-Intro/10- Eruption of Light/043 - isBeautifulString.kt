fun isBeautifulString(inputString: String): Boolean {
    val sortedMap = inputString.groupingBy { it }.eachCount().toSortedMap()
    ('a' .. 'z').forEach {  sortedMap.putIfAbsent(it, 0)}
    val sortedValues = sortedMap.values.toList()
    return (0 until sortedValues.size -1).all { sortedValues[it] >= sortedValues[it+1] }

}