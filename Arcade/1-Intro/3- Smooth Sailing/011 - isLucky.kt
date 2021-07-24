fun isLucky(n: Int): Boolean {
    val num =n.toString().toMutableList()
    val half = num.size/2
    var sumfirst = 0
    var sumsecond = 0
    val first = num.subList(0,half)
    val second =num.subList(half,num.size)
    for (i in 0 until first.size) {
        sumfirst+= first[i].toInt()
    }
    for (i in 0 until second.size) {
        sumsecond+= second[i].toInt()
    }


    return sumfirst==sumsecond
}
