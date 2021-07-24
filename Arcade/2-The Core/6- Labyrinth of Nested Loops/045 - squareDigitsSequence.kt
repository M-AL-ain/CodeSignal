fun squareDigitsSequence(a0: Int): Int {
    var n = a0
    val list = mutableSetOf<Int>()
    list.add(a0)

    while (true) {
        var sum = 0
        while (n != 0) {
            sum += Math.pow((n % 10).toDouble(), 2.0).toInt()
            n /= 10
        }
        if (list.contains(sum))
            break
        list.add(sum)
        n = sum

    }

    return list.size+1
}
