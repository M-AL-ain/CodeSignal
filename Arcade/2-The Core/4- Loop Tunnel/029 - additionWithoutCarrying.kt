fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var p1 = param1
    var p2 = param2
    var temp = 0
    var power = 0

    while (p1 != 0 || p2 != 0) {
        temp += ((p1 + p2) % 10) *Math.pow(10.0, power.toDouble()).toInt()
        p1 /= 10
        p2 /= 10
        power += 1
    }
    return temp
}
