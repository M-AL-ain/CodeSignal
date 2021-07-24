fun adaNumber(line: String): Boolean {
    val line = line.filter { it != '_' }
    if (line.isEmpty()) {
        return false
    }

    if (line.contains("#")) {
        val s = "0123456789abcdef"
        val t = "0123456789ABCDEF"

        val vals = """([\d]+)#([\da-fA-F]+)#""".toRegex().matchEntire(line)?.groupValues
        if (vals == null) {
            return false
        }

        val base = vals[1].toInt()
        if (base !in 2..16) {
            return false
        }

        return vals[2].all { it in s.substring(0, base) || it in t.substring(0, base)}
    } else {
        return line.all { it.isDigit() }
    }
}
