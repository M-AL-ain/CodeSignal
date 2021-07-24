fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
	val s = HashSet<Int>()

	for (i in 0 until matrix.size- 1) {
		for (j in 0 until matrix[0].size - 1) {
			val temp = matrix[i][j] * 1000000 +
					matrix[i][j + 1] * 10000 +
					matrix[i + 1][j] * 100 +
					matrix[i + 1][j + 1]

			s.add(temp)
		}
	}

	return s.size
}