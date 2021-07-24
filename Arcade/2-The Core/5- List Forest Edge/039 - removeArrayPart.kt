fun removeArrayPart(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
    for (i in l..r)
        inputArray.removeAt(l)
    return inputArray
}
