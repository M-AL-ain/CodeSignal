fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    val max = inputArray.map{ it.length }.max() ?: 100
    return inputArray.filter {it.length == max}.toMutableList()
}
