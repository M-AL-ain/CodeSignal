fun candles(candlesNumber: Int, makeNew: Int): Int {
    var sum = candlesNumber
    var temp = candlesNumber
    while (temp >= makeNew) {
        val cand = temp / makeNew
        sum += cand
        temp -= cand * makeNew
        temp += cand
    }
    return sum
}
