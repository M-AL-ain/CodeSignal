fun electionsWinners(votes: MutableList<Int>, k: Int): Int {

    val maxVote = votes.max() ?: 0

    if(k==0){
        return if (votes.count { it == maxVote } > 1) 0 else 1
    }
    return votes.count { it+k > maxVote }
}
