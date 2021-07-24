fun isSubstitutionCipher(a: String, b: String): Boolean {
    val f = { x: String, y: String -> x.indices.groupBy({ x[it] }, { y[it] }).all { it.value.toSet().size == 1 } }
    return f(a, b) && f(b, a)
}
