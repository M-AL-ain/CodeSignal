fun comfortableNumbers(l: Int, r: Int): Int {
    var res = 0
    for (a in l..r) {
        for (b in a + 1..r) {
            val aSum = digitSum(a)
            val bSum = digitSum(b)
            if (a in (b - bSum)..(b + bSum) && b in (a - aSum)..(a + aSum)) {
                ++res
            }
        }
    }
    return res
}

fun digitSum(n: Int): Int {
    return generateSequence(n) { it / 10 }.takeWhile { it > 0 }.map { it % 10 }.sum()
}
