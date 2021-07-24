fun volleyballPositions(formation: MutableList<MutableList<String>>, k: Int) =
    formation.map { it.toMutableList() } .apply {
        val pos = mapOf(
            1 to (3 to 2),
            2 to (1 to 2),
            3 to (0 to 1),
            4 to (1 to 0),
            5 to (3 to 0),
            6 to (2 to 1)
        )

        for (i in 1..6) {
            val pre = Math.floorMod(i + k - 1, 6) + 1
            val (preR, preC) = pos[pre]!!
            val (curR, curC) = pos[i]!!
            this[preR][preC] = formation[curR][curC]
        }
    }
