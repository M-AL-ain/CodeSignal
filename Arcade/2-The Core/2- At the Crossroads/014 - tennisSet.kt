fun tennisSet(score1: Int, score2: Int): Boolean {
    var min = 0
    var max = 0
    when {
        score1 >= score2 -> {
            min = score2;
            max = score1;
        }
        else -> {
            max = score2;
            min = score1;
        }
    }

    return ((max == 7 && min >= 5 && min < max) || (max == 6 && min <= 4))
}
