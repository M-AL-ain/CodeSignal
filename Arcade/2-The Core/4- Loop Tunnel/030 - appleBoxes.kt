fun appleBoxes(k: Int): Int {
    var r = 0
    var y = 0
    for (i in 1..k) {
        if (i % 2 == 0) r += i * i else y += i * i
    }
    return r - y
}
