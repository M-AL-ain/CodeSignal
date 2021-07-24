fun newNumeralSystem(number: Char): MutableList<String> {
    return (65..65+((number.toInt()-65)/2)).map{""+it.toChar()+" + "+(65+(number-it.toChar())).toChar()}.toMutableList()
}