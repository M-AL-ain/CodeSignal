fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var sorteed =statues.sorted()
    var num = 0
    for (s in sorteed.first()..sorteed.last()) {
        if (sorteed.indexOf(s) == -1)
            num++
    }
    return num


}
