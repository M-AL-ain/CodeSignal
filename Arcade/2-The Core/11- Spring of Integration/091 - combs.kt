fun combs(comb1: String, comb2: String): Int {
    val combA: String
    val combB: String
    if (comb1.length > comb2.length) {
        combA = comb1
        combB = comb2
    } else {
        combA = comb2
        combB = comb1
    }
    val n = combA.length
    val m = combB.length
    val l = n + m
    val k = n - m
    var a = combA.replace('.', '0').replace('*', '1').toInt(2)
    var b = combB.replace('.', '0').replace('*', '1').toInt(2)
    for (i in 0..k)
        if (a and (b shl i) == 0)
            return n
    for (i in 1..m)
        if (a and (b shl i + k) == 0 || (a shl i) and b == 0)
            return n + i
    return l
}