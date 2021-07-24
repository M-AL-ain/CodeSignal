fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {


    val longest = inputArray.maxByOrNull { it.length }
    var max = longest?.length
    var s = inputArray.filter { it.length == max }
    return s.toMutableList()
}