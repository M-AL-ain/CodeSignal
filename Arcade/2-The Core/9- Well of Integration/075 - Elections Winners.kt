fun electionsWinners(votes: MutableList<Int>, k: Int): Int {
    val max = votes.max()!!
    return if (k == 0) {
        val maxNum = votes.filter { it == max}.count()
        if (maxNum > 1) 0 else 1
    } else {
        votes.filter { it + k > max }.count()
    }
}