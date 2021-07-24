fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    var t1 = s.div(min1)
    var t2 = 0
    var t3 = 0

    when {
        t1 > 1 -> {
            t1 = 1;
            t2 = (s - min1) / min2_10;
            when {
                t2 > 9 -> {
                    t2 = 9;
                    t3 = (s - min1 - t2 * min2_10) / min11;
                }
            }
        }
    }

    return t1 + t2 + t3;

}
