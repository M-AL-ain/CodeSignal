fun fileNaming(names: MutableList<String>): MutableList<String> {
	val letters: MutableList<String> = mutableListOf()
	for (symbols in names) {
		var count = 0
		var elements = symbols
		while (letters.contains(elements)) {
			count++
			elements = "$symbols($count)"
		}
		letters.add(elements)
	}
	return letters
}