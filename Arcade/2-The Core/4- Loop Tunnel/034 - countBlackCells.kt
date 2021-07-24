fun countBlackCells(n: Int, m: Int): Int {
    var temp = 1
    var i = 1
    while (i <= n && i <= m) {
        if (n % i == 0 && m % i == 0) {
            temp = i
        }

        ++i
    }

    return n + m + temp - 2
}
