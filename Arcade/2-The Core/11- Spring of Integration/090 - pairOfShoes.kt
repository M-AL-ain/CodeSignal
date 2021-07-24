fun pairOfShoes(shoes: MutableList<MutableList<Int>>): Boolean {
    return shoes.groupBy({ it[1] }, { it[0] })
        .values
        .toList()
        .filter { it.count { it == 0 } != it.count { it == 1 } }
        .isEmpty()
}