fun numberOfClans(divisors: MutableList<Int>, k: Int): Int {
    var curSum: Int = 0
    val clans = mutableListOf<Int>()
    for(i in 1..k) {
        for(j in 0 until divisors.size) {
            if(i % divisors[j] == 0) {
                curSum += Math.pow(10.0, j.toDouble()).toInt()
            }
        }
        clans.add(curSum)
        curSum = 0
    }
    return clans.distinct().size
}