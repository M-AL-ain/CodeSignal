fun isSumOfConsecutive2(n: Int): Int {
    var num = 0
    for (i in 1..n / 2) {
        var Sum = i
        var j = i
        while (Sum < n) {
            j++
            Sum += j
            if (Sum == n) num++
        }
    }

    return num
}
