fun increaseNumberRoundness(n: Int): Boolean {
    var bool= false
    var num = n
    while (num != 0) {
        if (num % 10 != 0) {
            bool = true
        }
        if (num % 10 == 0) {
            if (bool) {
                return true
            }
        }
        num /= 10
    }
    return false
}
