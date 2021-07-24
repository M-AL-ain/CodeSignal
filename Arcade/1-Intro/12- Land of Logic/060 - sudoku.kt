fun sudoku(grid: MutableList<MutableList<Int>>): Boolean {
	if (grid.any { it.distinct().count() < 9 }) {
		return false
	}
	if ((0 until 9).any { c -> grid.map { it[c] }.distinct().count() < 9 }) {
		return false
	}
	for (rows in (0 until 9).chunked(3)) {
		for (cols in (0 until 9).chunked(3)) {
			if (rows.flatMap { r -> cols.map { grid[r][it] } }.distinct().count() < 9) {
				return false
			}
		}
	}

	return true
}
