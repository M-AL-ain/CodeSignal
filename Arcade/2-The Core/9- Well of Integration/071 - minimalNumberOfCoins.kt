fun minimalNumberOfCoins(coins: MutableList<Int>, price: Int): Int {
    return coins.foldRight(Pair(0,price)){a,b -> Pair(b.first+b.second/a, b.second%a)}.first
}
