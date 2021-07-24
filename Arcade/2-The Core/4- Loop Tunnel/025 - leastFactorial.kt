fun leastFactorial(n: Int): Int {
    var f = 1
    var p = 2

    while (f < n) {
        f *= p
        p++
    }


    return f
}
