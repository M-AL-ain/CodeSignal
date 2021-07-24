fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
    if( lastNumberOfDays == 30 || lastNumberOfDays == 28)
    {val numday = mutableListOf<Int>(31)

        return numday} else {
        val othernumday = mutableListOf<Int>(28,30,31)
        return othernumday
    }
}
