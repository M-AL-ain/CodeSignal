fun isTandemRepeat(inputString: String): Boolean {
    return inputString.substring(0, inputString.length / 2) == inputString.substring(inputString.length / 2, inputString.length)
}
