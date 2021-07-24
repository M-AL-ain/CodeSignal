fun chessKnight(cell: String): Int {
	val v1 = move(cell, false, 1).flatMap { move(it, true, 2) }.toMutableList()
	val v2 = move(cell, false, 2).flatMap { move(it, true, 1) }
	v1.addAll(v2)
	return v1.toSet().size
}

fun move(cell: String, vertical: Boolean, i: Int): List<String> {
	val result = mutableListOf<String>()
	if (vertical) {
		result.add(cell.replaceFirst(cell[0], cell[0] + i))
		result.add(cell.replaceFirst(cell[0], cell[0] - i))
	} else {
		result.add(cell.replaceFirst(cell[1], cell[1] + i))
		result.add(cell.replaceFirst(cell[1], cell[1] - i))
	}
	return result.filter(::isValid)
}

fun isValid(cell: String): Boolean {
	return cell[0] in 'a'..'h' && cell[1] in '1'..'8'
}