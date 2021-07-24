fun String.numDiff(other: String) = this.zip(other).count { (f, s) -> f != s }

fun <T> List<T>.dropIndex(i: Int) = this.slice(this.indices.minus(i))

fun stringsRearrangement(inputArray: MutableList<String>): Boolean {
    return inputArray.withIndex().any {
            (index, item) -> impl(inputArray.dropIndex(index), item)
    }
}

fun impl(inputArray: List<String>, start: String): Boolean {
    for ((index, item) in inputArray.withIndex()) {
        if (item.numDiff(start) == 1 && impl(inputArray.dropIndex(index), item)) {
            return true
        }
    }
    return inputArray.isEmpty()
}