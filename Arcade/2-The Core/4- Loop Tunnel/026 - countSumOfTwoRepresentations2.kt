fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    var count = 0

    var a = maxOf(n - r, l)
    var b = n - a
    while (a <= r && a <= b)
    {
        count += 1
        a += 1
        b -= 1
    }
    return count
}
