fun correctNonogram(size: Int, nonogramField: MutableList<MutableList<String>>): Boolean {
    val rowsMatch =
        nonogramField.indices.filter {
            it >= (size + 1 ) / 2
        }.map{
            nonogramField[it].subList((size + 1) / 2, nonogramField[it].size).joinToString("")                 .matches(
                "^${nonogramField[it].subList(0, (size + 1) / 2)
                    .filter { it != "-" }
                    .map{
                        "\\.*#{$it}"
                    }
                    .joinToString("")}\\.*\$".toRegex()
            )
        }.all {
            it }

    val colsMatch =
        nonogramField[0].indices.filter {
            it >= (size + 1 ) / 2
        }.map { j -> nonogramField.indices.map{
                i -> nonogramField[i][j]
        } }.map{
            it.subList((size + 1) / 2, it.size).joinToString("")                                               .matches(
                "^${it.subList(0, (size + 1) / 2)
                    .filter { it != "-" }
                    .map{
                        "\\.*#{$it}"
                    }
                    .joinToString("")}\\.*\$".toRegex()
            )
        }.all {
            it }

    return   rowsMatch && colsMatch
}
