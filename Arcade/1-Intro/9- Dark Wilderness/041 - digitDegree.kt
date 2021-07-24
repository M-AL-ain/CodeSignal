tailrec fun digitDegree(n: Int, acc: Int = 0): Int = if (n.toString().length <= 1) acc else digitDegree(n.toString().sumBy { it - '0' }, acc + 1)
