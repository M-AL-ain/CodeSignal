fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    val temp: Int = inputArray.size
    for (i in 0 until temp) {
        if (inputArray[i] === elemToReplace) inputArray[i] = substitutionElem
    }
    return inputArray
}
