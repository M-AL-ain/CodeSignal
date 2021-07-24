fun houseOfCats(legs: Int): MutableList<Int> {
    var result : MutableList<Int> = mutableListOf()
    if (legs % 4 == 0) {
        for (i in 0 .. legs / 2 step 2) {
            result.add(i)
        }
    } else {
        for (i in 1 .. legs / 2 step 2) {
            result.add(i)
        }
    }

    return result
}
