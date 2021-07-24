fun digitsProduct(product: Int): Int {
    return try {
        (1..1_000_000).first { n ->
            val multiplied = n.toString()
                .map { it.toString().toInt() }
                .reduce { a, b -> a * b }
            multiplied == product
        }
    } catch (e: NoSuchElementException) {
        -1
    }
}