fun addTwoDigits(n: Int): Int   {

    var num = n
    var sum = 0

    while (num > 0) {
        val r = num % 10
        sum += r
        num /= 10
    }
    return sum

}
  