fun rounders(n: Int): Int {

    var num = n
    var ten = 10
    while (num > ten) {
        when {
            (num % ten) / (ten / 10) < 5 -> num = (num / ten) * ten
            else -> num =  (num/ten+1) * ten
        }
        ten *= 10
    }
    return num
}
