fun isInformationConsistent(evidences: MutableList<MutableList<Int>>): Boolean {
    return evidences.let { (0 until evidences[0].size).map { i -> evidences.map { it[i] } } }
        .map { it.filter { it != 0 }.map { it > 0 }.distinct().size < 2 }
        .reduce { a, b -> a and b }
}