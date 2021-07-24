fun magicalWell(a: Int, b: Int, n: Int): Int {
    var sum = 0
    var num1 = a
    var num2 = b
    for (i in 1..n) {
        sum += num1 * num2
        num1++
        num2++
    }

    return sum
}
