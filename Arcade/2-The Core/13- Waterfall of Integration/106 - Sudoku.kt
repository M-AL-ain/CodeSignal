fun sudoku(grid: MutableList<MutableList<Int>>): Boolean {
    return grid.all { it.toSet().size == 9 }
            && (0..8).map{ j -> grid.map { it[j] } }.all { it.toSet().size == 9 }
            && (0..6 step 3).all { i ->
        (0..6 step 3).all { j ->
            (0..2).flatMap { k ->
                grid[i+k].subList(j, j + 3)
            }.toSet().size == 9
        }
    }
}
